public class Stocks {
    public static void main(String[] args) {
        int[] data = {100 ,50 ,70 ,69 ,334 ,871 ,922 ,325 ,454 ,673 ,746 ,706 ,626 ,911 ,718 ,15 ,
                75 ,718 ,610 ,391 ,891 ,423 ,93 ,271 ,49 ,273 ,201 ,527 ,897 ,347 ,857 ,689 ,435 ,
                476 ,138 ,626 ,770 ,975 ,738 ,170 ,692 ,534 ,621 ,162 ,641 ,553 ,63 ,304 ,924 ,
                27 ,476 ,666 ,582 ,322 ,146 ,157 ,50 ,369 ,848 ,736 ,180 ,243 ,488 ,946 ,875 ,
                478 ,415 ,541 ,989 ,154 ,518 ,837 ,874 ,693 ,257 ,785 ,792 ,212 ,164 ,981 ,845 ,
                952 ,30 ,505 ,220 ,402 ,933 ,162 ,222 ,292 ,145 ,371 ,105 ,334 ,117 ,728 ,991 ,58 ,
                591 ,70 ,205 ,644 ,217 ,202 ,
        };

        int maxProfit =Stocks.Equity(data);
        System.out.println("The best profit in equity could be "+maxProfit+"\n");
    }

    private static int Equity(int[] data) {
        int profit = 0;
        int buy=0,sell=0;
        for(int i = 0; i< data.length; i++){
            for(int j = i; j< data.length;j++){
                if((data[j]-data[i])>profit){
                    profit = (data[j]-data[i]);
                    buy = i;
                    sell = j;
                }
            }
        }
        System.out.println("\nBuy at "+data[buy]+" Sell at "+data[sell]);
        return profit;
    }
}
