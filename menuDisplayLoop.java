//Menu display loop
		 do {
		       displayMenu();
		       System.out.println("Enter menu option.");
		       menuOption = scanner.next().charAt(0);
				
		       switch(menuOption) {
					case 1:
						intakeNewDog(scanner);
						System.out.println("[1] Intake a new dog");
						break;
						
					case 2:
						intakeNewMonkey(scanner);
						System.out.println("[2] Intake a new monkey");
						break;
					
					case 3:
						reserveAnimal(scanner);
						System.out.println("[3] Reserve an animal");
						break;
					
					case 4:
						printAnimals("Dog");
						System.out.println("[4] Print a list of all dogs");
						break;
					
					case 5:
						printAnimals("Monkey");
						System.out.println("[5] Print a list of all monkeys");
						break;
					
					case 6:
						printAnimals("Available");
						System.out.println("[6] Print a list of all animals that are not reserved");
						break;
					
					case 7:
					System.out.println("[q] Quit application");
					break;
		        
               }
         } while (menuOption != 'q');
    }    