public class Triangle {

    public int getPerimetr(int a , int b , int c){
        return a+b+c;
    }
    public float getPerimetr(float a , float b , float c){
        return a+b+c;
    }
    public long getPerimetr(long a , long b , long c){
        return a+b+c;
    }

    public double getArea(int a , int b , int c){
        int p = (a+b+c)/2;
        int s = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(s);
    }
    public double getArea(float a , float b , float c){
        float p = (a+b+c)/2;
        float s = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(s);
    }
}
