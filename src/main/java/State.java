public enum  State {

    full{
         @Override
         public String toString() {
             return "сытый";
         }
     },

    hungry{
         @Override
         public String toString() {
             return "голодный";
         }
     }
}
