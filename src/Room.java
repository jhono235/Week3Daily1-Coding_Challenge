public class Room {
    private static Room [][] rooms;
    public final boolean isInfected;
    int countRooms = 0;
    public boolean visited = false;
    Room(boolean infected){
        isInfected = infected;
    }

    public static boolean isOutbreak(Room [][]floor){
    rooms = floor;

      int countRooms = 0;

       for(int i = 0;i<floor.length;i++){
           for(int j = 0;j<floor.length;j++){
               if ((floor[i][j].visited)){
                   continue;
               }
               if(floor[i][j].isInfected){
                   countRooms = 0;
                   

               }

               }

           }
        return false;

       }

   boolean checkInfected(Room [][] rooms, int i, int j){
        if(i< 0 || i>=rooms.length || j<0 || j>=rooms.length){
            return false;
        }
        if (rooms[i][j].visited){
            return false;
        }
        else{
            rooms[i][j].visited =true;
        }
        if (rooms[i][j].isInfected){
            countRooms++;
        }
        else {
            return false;
        }
        if (countRooms>=5){
            return true;
        }

        return
        checkInfected(rooms, i+1,j) ||
        checkInfected(rooms,i-1,j) ||
        checkInfected(rooms,i,j+1) ||
        checkInfected(rooms, i, j-1);


}


}
