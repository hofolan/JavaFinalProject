public class imageSort
{
   //fields
   private String[][] images = {{"acec.jpg","aced.jpg","aceh.jpg","aces.jpg"},
                {"kingc.jpg","kingd.jpg","kingh.jpg","kings.jpg"},
                {"queenc.jpg","queend.jpg","queenh.jpg","queens.jpg"},
                {"jackc.jpg","jackd.jpg","jackh.jpg","jacks.jpg"},
                {"10c.jpg","10d.jpg","10h.jpg","10s.jpg"},
                {"9c.jpg","9d.jpg","9h.jpg","9s.jpg"},
                {"8c.jpg","8d.jpg","8h.jpg","8s.jpg"},
                {"7c.jpg","7d.jpg","7h.jpg","7s.jpg"},
                {"6c.jpg","6d.jpg","6h.jpg","6s.jpg"},
                {"5c.jpg","5d.jpg","5h.jpg","5s.jpg"},
                {"4c.jpg","4d.jpg","4h.jpg","4s.jpg"},
                {"3c.jpg","3d.jpg","3h.jpg","3s.jpg"},
                {"2c.jpg","2d.jpg","2h.jpg","2s.jpg"}};
                
                
   String cardImage;
   
   
      
   //methods
   
   /**
   constructor
   */
   public imageSort()
   {
     cardImage = "gof";
   }


/**
fixImage()method takes a card object and assigns the correct image file
@param Card object
*/
   
   public void fixImage(Card obj)
    {
      int rank = obj.getRank();
      int suit = obj.getSuit();
      
      cardImage = (images[13-rank][3-suit]);
    }

   /**
   method getImage()
   @return string of the image file name
   */
   public String getImage()
   {
      return cardImage;
   }


public static void main(String[]args)
{
   imageSort sorter = new imageSort();
   
   Card test = new Card(1,0);
   
   sorter.fixImage(test);
   
   System.out.println(sorter.getImage());
   
   
}

}