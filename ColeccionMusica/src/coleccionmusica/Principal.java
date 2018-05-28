package coleccionmusica;

import java.util.Scanner;

public class Principal {
            
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        int opcion;
        int numArtista = 0;
        int numAlbum=0;
        
        Artista[] artista = new Artista[20];
        Album[] album = new Album[20];
        
        do{
        
        System.out.println("\n\t Mi Coleccion de Musica");
        
        System.out.println("¿ Qué desea Ingresar ?");
        System.out.println(" 1. Artista");
        System.out.println(" 2. Album");
        System.out.println(" 3. Genero");        
        System.out.println(" 4. Su Coleccion");
        System.out.println(" 5. Salir");
        
        System.out.print("Ingrese la opcion: ");
        opcion = scan.nextInt();
        
        switch(opcion){
            
        case 1:
               
            scan.nextLine();
            
            System.out.println("\nIngresar Artista");
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
        
            System.out.print("Fecha Nacimiento (dd/mm/yyyy): ");
            String fechaNac = scan.nextLine();
       
            System.out.print("Pais: ");
            String pais = scan.nextLine();
            
            artista[numArtista] = new Artista(nombre,fechaNac,pais);
                   
            for(int i=0; i<numArtista; i++){
                
                    if(artista[numArtista].equals(artista[i])){
                        
                        numArtista--;
                        //System.out.println("Artista Igual"); 
                        System.out.println("\nEl Artista ya ha sido ingresado !!");
                        System.out.println("Desea Ingresar un Album para este Artista ? ");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.print("Ingrese Opcion : ");
                        
                        int crearAlb = scan.nextInt();
                        
                        if(crearAlb == 1){
                            
                                System.out.println("\nIngresar Album");

                                System.out.print("Año Lanzamiento : ");
                                int añoLanz = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Nombre: ");
                                String nombreAlb = scan.nextLine();

                                System.out.print("Genero: ");
                                String genAlbum = scan.nextLine();

                                System.out.print("Artista: ");
                                String nomArtista = scan.nextLine();;

                                System.out.print("Numero de Canciones: ");
                                int numCanciones = scan.nextInt();

                                 album[numAlbum] = new Album(añoLanz,nombreAlb,numCanciones,genAlbum,nomArtista);

                                 numAlbum++;

                             break; 
                        }else{
                            break;
                        }
                    }else{
                        //System.out.println("No son Iguales");
                    }
                }
            
            numArtista++;
            
                break;
                
        case 2:
                
            System.out.println("\nIngresar Album");
            
            System.out.print("Año Lanzamiento : ");
            int añoLanz = scan.nextInt();
            scan.nextLine();
            System.out.print("Nombre: ");
            String nombreAlb = scan.nextLine();
        
            System.out.print("Genero: ");
            String genAlbum = scan.nextLine();
                               
            System.out.print("Artista: ");
            String nomArtista = scan.nextLine();;
        
            System.out.print("Numero de Canciones: ");
            int numCanciones = scan.nextInt();
            
            album[numAlbum] = new Album(añoLanz,nombreAlb,numCanciones,genAlbum,nomArtista);
            
            
            numAlbum++;
                break;
                
        case 3:
                     
            System.out.println("\nIngrese Genero");
            scan.nextLine();
            System.out.print("Genero: ");
            String genero = scan.nextLine();
        
                break;
                
        case 4:     
            
            System.out.println("\t\nSu Coleccion de Musica");
            
                      
            for(int i=0; i<numArtista ;i++){
            System.out.println(" Datos: " + artista[i].toString());
            for(int j=0; j<numAlbum; j++){
                if(artista[i].getNombre().equals(album[j].getArtista())){
                    System.out.println(" Album: " + album[j].toString());
                }
            }
                System.out.println("\n"); 
            }
            break;
            
        case 5:
                        
            System.out.println("\nEsta seguro de que desea Salir ?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Ingrese Opcion = ");
            int opcSalir = scan.nextInt();
            if(opcSalir == 1){
                break;
            }else{
                opcion=0;
            }
            break;
                
        default:
                
                System.out.println("\nOpcion Incorrecta !");
                break;
            
        }


        }while(opcion!=5);
        
    }
    
}

