public class Ring {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        double randomValue = Math.random();
        if(checkWeight()){
            while(fighter1.health > 0 && fighter2.health > 0){
                if(randomValue < 0.5D){
                    System.out.println("========Yeni Round========");
                    fighter2.health = fighter1.hit(fighter2);
                    if(isWin()){
                        break;
                    }
                    fighter1.health = fighter2.hit(fighter1);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }else{
                    System.out.println("========Yeni Round========");
                    fighter1.health = fighter2.hit(fighter1);
                    if(isWin()){
                        break;
                    }
                    fighter2.health = fighter1.hit(fighter2);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }
            }
        }else{
            System.out.println("Boksörlerin sikletleri farklı!");
        }
    }

    public boolean checkWeight(){
        return (fighter1.weight >= minWeight && fighter1.weight <= maxWeight) && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight);
    }

    public boolean isWin(){
        if(fighter1.health <= 0){
            System.out.println("Maçı Kazanan: " + fighter2.name);
            return true;
        } else if (fighter2.health <= 0) {
            System.out.println("Maçı Kazanan: " + fighter1.name);
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("----------------");
        System.out.println(fighter1.name + " kalan canı: " + fighter1.health);
        System.out.println(fighter2.name + " kalan canı: " + fighter2.health);
    }
}
