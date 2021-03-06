package by.it.meshchenko.jd02_01;

public class ImitationFlowBuyers implements Runnable {
    private int goTime = 0;
    private int timeWork;
    private boolean createBuyer = false;
    private int aBMF = 10;                           // 'amountBuyerMaxFirst' N >= t+10
    private int aBMS = 70;                           // 'amountBuyerMaxSecond' N <= 40+(30-t)
    private int tempNumberBuyer = 0;                 // N

    public ImitationFlowBuyers(int timeWork){
        this.timeWork = timeWork;
    }

    @Override
    public void run()  {
        try{
            while(flowBuyers()){
                synchronized (Dispatcher.totalSynchr){
                    PrintView pv = new PrintView();
                    pv.setTime(++goTime);
                    pv.setTotal(Dispatcher.total);
                    Dispatcher.printWork(pv);
                }
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){

        }
    }

    boolean flowBuyers(){
        boolean isWork = false;
        int count = 0;
        try{
            Buyer.lockBuyers.lock();
            count = Buyer.listBuyers.size();
            PrintView pv = new PrintView();
            pv.setCountBuyer(count);
            Dispatcher.printWork(pv);
        }
        finally {
            Buyer.lockBuyers.unlock();
        }
        if(goTime < timeWork){                                     // магазин работает 0...120 сек
            isWork = true;
            if( goTime%60 <= 30 && count <=  (goTime%60 + aBMF)) {  // первые 30 сек в минуте N <= t+10
                createBuyer = true;
            } else if(goTime%60 > 30 && count <=  aBMS - goTime%60) {  // вторые 30 сек в минуте N <= 40+(30-t)
                createBuyer = true;
            } else {
                createBuyer = false;
            }

            if(createBuyer){                                        // Создаём покупателя
                int currentBuyerCount = Helper.random(0, 5);        // Каждую секунду 0..5 покупателя
                boolean isPensioner = (Helper.random(0, 3) == 0);
                for (int j = 0; j < currentBuyerCount; j++){
                    Buyer b = new Buyer(tempNumberBuyer++, isPensioner);
                    b.start();
                    try{
                        Buyer.lockBuyers.lock();
                        Buyer.listBuyers.add(b);
                    }
                    finally {
                        Buyer.lockBuyers.unlock();
                    }
                }
            }
        }
        return isWork;
    }
}
