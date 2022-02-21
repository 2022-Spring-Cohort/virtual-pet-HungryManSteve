package virtual_pet;

import java.util.Scanner;


public class GameLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to Pet Ranch.");
        System.out.println("Here are pets to take care of.");
        Scanner scan = new Scanner(System.in);

        PetShelter defaultStart = new PetShelter();
        defaultStart.petShelterDefault();
        defaultStart.petStats();
        var _cageOrganic = new CageOrganic();
        var myMenu = new MenuSystem(defaultStart, _cageOrganic);

        while(true){


            System.out.println(myMenu.menuSystem());
            System.out.println();
            System.out.println("The cages are this dirty: " + _cageOrganic.getCageClean());
            String answer = scan.nextLine();
            myMenu.menuLogic(answer);
            defaultStart.petTick();
            _cageOrganic.tick();








//        var myMenu2 = new virtual_pet.MenuSystem("asdfadsfadsfasdfsdfdfasf");
//        var jeff = 4;
//        System.out.println(virtual_pet.MenuSystem.yolo());
//        System.out.println(myMenu.gootTooxt());
//        System.out.println(myMenu2.yabbaDabba());
//
//        System.out.println(jeff + jeff);
        }
    }
}


