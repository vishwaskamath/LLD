package behavioral.strategy;

public class DrivingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String start, String end){
        System.out.println("Building driving route from " + start + " to " + end);
    }
}
