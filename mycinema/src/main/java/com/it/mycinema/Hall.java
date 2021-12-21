import java.util.ArrayList;


public class Hall {
   protected Movie movie;
   private String parties[][] = {{"12:00pm", "2:00pm"}, {"2:10pm", "4:10pm"}, {"4:20pm", "6:20pm"}, {"6:30pm", "8:30pm"}, {"8:40", "9:40"}};
   

   private ArrayList<Party> partiesArrayList = new ArrayList<Party>(5);

   public Hall(){
       setParties(parties);
    }

    

   
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Movie getMovie() {
        return movie;
    }

    private void setParties(String[][] parties){
       for(int i=0; i < parties.length; i++){
           for(int j=0; i < parties[i].length; j = j + 2){
               partiesArrayList.add(new Party(parties[i][j], parties[i][j+1]));
           }
       } 
    }
    public Party party(int index){
        return partiesArrayList.get(index);
    }
   }


