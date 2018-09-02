public class Cat {

    //    Сотояние кота(сытый голодный)
    private String state;

    Cat() {
            state = State.hungry.toString();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    private void toEat(){
        System.out.println("Кот поел");
    }

    private void sleep(){
        System.out.println("Кот поспал");
    }

    private void runAway(){
        System.out.println("Кот убежал");
    }


    public int action(String in){

        String inLower = in.toLowerCase();

        if (Util.inDataIsTrue(inLower)){

            //        колбаса, сытый
            if (this.getState().equals(State.full.toString())
                    && inLower.equals("колбаса")){
            //            спать, перейти в состояние голодный
                this.sleep();
                this.setState(State.hungry.toString());
                System.out.println(this.getState());
                return 1;
            }

            //        колбаса, голодный
            if (this.getState().equals(State.hungry.toString())
                    && inLower.equals("колбаса")){
            //            съесть, перейти в состояние сытый
                this.toEat();
                this.setState(State.full.toString());
                System.out.println(this.getState());
                return 2;
            }

            //        собака, сытый
            if (this.getState().equals(State.full.toString())
                    && inLower.equals("собака")){
            //            убежать, перейти в состояние голодный
                this.runAway();
                this.setState(State.hungry.toString());
                System.out.println(this.getState());
                return 3;
            }

            //        собака, голодный
            if (this.getState().equals(State.hungry.toString())
                    && inLower.equals("собака")){
            //            убежать
                this.runAway();
                return 4;
            }
        }
        return 0;
    }
}
