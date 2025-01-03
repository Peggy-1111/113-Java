public class Ocean {
    public static void main(String[] args) {
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("蘭尼"));
        doSwim(new Human("賈斯汀"));
        doSwim(new Submarine("黃色一號"));
        doSwim(new Seaplane("空軍零號"));
        doSwim(new FlyingFish("甚平"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
//        if(swimmer instanceof  Seaplane){
//            ((Seaplane) swimmer).fly();
//        }
//        if (swimmer instanceof FlyingFish){
//            ((FlyingFish) swimmer).fly();
//        }
        if(swimmer instanceof Flyer){
            ((Flyer)swimmer).fly();
        }
    }
}