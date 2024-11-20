
public class Cheers {
        public static void main(String[] args) {
                String name=args[0];
                int times= Integer.parseInt(args[1]);
                String name1=name.toUpperCase();
                name=name1;
                while(name1.length()>0){
                        char firstchar=name1.charAt(0);
                        if(firstchar=='A'||firstchar=='E'||firstchar=='F'||firstchar=='H'||firstchar=='I'||firstchar=='L'||firstchar=='M'||firstchar=='N'||firstchar=='O'||firstchar=='R'||firstchar=='S'||firstchar=='X'){
                                 System.out.println("Give me an "+firstchar+" : "+firstchar+" !");

                        }
                        else
                        System.out.println("Give me a "+firstchar+" : "+firstchar+" !");
                name1=name1.substring(1);
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < times; i++) {
                        System.out.println(name+" ! ! !");
                    
                }
                
        }
   }

