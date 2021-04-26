package Insurance;


    public class Health extends Insurance{
        public Health()
        {
            super("Health policy");
            setCost();
        }
        public void setCost()
        {
            this.cost = 196;
        }
        public void display()
        {
            System.out.println(type+"cost per month: $" + String.format("%.2f",this.getCost()));
        }


}
