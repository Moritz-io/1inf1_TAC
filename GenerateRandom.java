

    import java.util.Random;
class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 18;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound); 
      System.out.println(int_random);
    }
}

