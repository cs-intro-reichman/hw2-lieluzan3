public class TimeCalc {
    public static void main(String[] args) {
        int hours= Integer.parseInt(args[0]);
        int minutes= Integer.parseInt(args[1]);  
        int addminutes= Integer.parseInt(args[2]);
        minutes=minutes+addminutes;
        int zeronum=0;
        if(minutes>60){
            int mod1;
            mod1=minutes;
            minutes=minutes/60;
            mod1=mod1%60;
            hours=hours+minutes;

            if(hours>=24){
                hours=hours%24;
                if(hours<10){
                    if(mod1<10){
                     System.out.println(zeronum+hours+":"+zeronum+mod1);
                    }
                    else 
                    System.out.println(zeronum+""+hours+":"+mod1);
                }
                if(hours>10){
                    if(mod1<10){
                        System.out.println(hours+":"+zeronum+mod1);
                       }
                       else 
                        System.out.println(hours+":"+mod1);

                }
                
                }
                else if(hours<10){
                    if(mod1<10){
                     System.out.println(zeronum+hours+":"+zeronum+mod1);
                    }
                    else 
                    System.out.println(zeronum+""+hours+":"+mod1);
                }
                if(hours>10){
                    if(mod1<10){
                        System.out.println(hours+":"+zeronum+mod1);
                       }
                       else 
                        System.out.println(hours+":"+mod1);
                 
            }
           
            
        }
        
            else if(minutes<60){
                    if(minutes<10){
                         if(hours<10){
                            System.out.println(zeronum+hours+":"+zeronum+minutes);

                            }
                                  else
                                   System.out.println(hours+":"+zeronum+minutes);
                        }
                        else if(minutes>=10){
                            if(hours<10)
                            System.out.println(zeronum+""+hours+":"+minutes);
                            else
                            System.out.println(hours+":"+minutes);

                        }
                     }
                    else if(minutes<10){
                        if(hours<10){
                           System.out.println(zeronum+hours+":"+zeronum+minutes);

                           }
                                 else
                                  System.out.println(hours+":"+zeronum+minutes);

                 }
                    else if(minutes==60){
                        hours++;
                        hours=hours%24;
                         minutes=0;
                             if(hours<10){
                                System.out.println(zeronum+""+hours+":"+zeronum+""+minutes);
                            }
                            else
                              System.out.println(hours+":"+zeronum+minutes);

     }
        
       else 
      System.out.println(hours+":"+minutes);
 }
}
   
        


       


        
    

