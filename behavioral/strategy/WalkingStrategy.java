package behavioral.strategy;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String start, String end){
        System.out.println("Building walking route from " + start + " to " + end);
    }
}
