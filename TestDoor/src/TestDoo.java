import java.util.Scanner;
public class TestDoo {
    public static void main(String[] args){
        int option = 0;
        Scanner input = new Scanner(System.in);
        DoorWithCodeLock door = new DoorWithCodeLock();
        while(true)
        {
            System.out.println("1:open door");
            System.out.println("2:close door");
            System.out.println("3:Lock door");
            System.out.println("4:Unlock door");
            System.out.printf("5:Exit");
            System.out.printf("enter your option:");
            option = input.nextInt();
            switch (option){
                case 1:door.openDoor();
                    break;
                case 2:door.closeDoor();
                    break;
                case 3:door.lockDoor();
                    break;
                case 4:door.unLockDoor();
                    break;
                case 5:System.out.println("exit the loop and end the program");
                    return;
                default:System.out.println("Invalid option");
                    break;
            }
        }

    }
}
 class Door {
    private boolean isDoor =false;
    public void openDoor(){
        if (isDoor){
            System.out.println("Door already open!");
        }else{
            System.out.println("Door opened!");
            isDoor =true;
        }
    }

    public void closeDoor() {
        if (isDoor){
            System.out.println("Door closed!");
            isDoor =false;
        }else{
            System.out.println("Door already close");
        }
    }

    public Boolean isDoor() {
       return isDoor;
    }
}
class DoorWithLock extends Door{
    public boolean isLocked = false;
    public void openDoor(){
        if (!isDoor()&&isLocked){
            System.out.println("Door is locked and cannot be opened!");
        }else{
            super.openDoor();
        }
    }
    public void lockDoor(){
        if(isDoor()){
            System.out.println("Open door cannot be locked!");
        } else if (isLocked){
            System.out.println("Door already locked!");
        }else{
            System.out.println("Door locked");
            isLocked =true;
        }
    }

    public void unLockDoor() {
        if (isLocked){
            System.out.println("Door is not locked!");
            isLocked =false;
        }else{
            System.out.println("Door unlocked");
        }
    }


}
class DoorWithCodeLock extends DoorWithLock{
    int code = 0;
    Scanner scanner = new Scanner(System.in);
    public void lockDoor(){
        if (isLocked){
            System.out.println("Door already locked!");
        }else{

            System.out.println("enter code and save:");
            code = scanner.nextInt();
            System.out.println("Door locked");
            isLocked =true;
        }
    }

    public void unLockDoor() {
        if (isLocked){
            System.out.println("enter code and compare:");
            int inputCode = scanner.nextInt();
            if(code == inputCode) {
                System.out.println("code match,Door is not locked!");
                isLocked = false;
            }else{
                System.out.println("invalid pass word(code), repeat your code!");
            }
        }else{
            System.out.println("Door unlocked");
        }
    }
}