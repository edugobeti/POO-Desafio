package Application;

import java.util.Scanner;

import Application.apps.InternetApp;
import Application.apps.IpodApp;
import Application.apps.TelephoneApp;

public class Iphone {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        InternetApp internetApp = new InternetApp();
        IpodApp ipodApp = new IpodApp();
        TelephoneApp telephoneApp = new TelephoneApp();
        Integer i = null;

        do{
            System.out.println("Aplicativos");
            System.out.println("0-Home | 1-Telefone | 2-Music | 3-Internet");
            i = sc.nextInt();
            Integer option;

            if(i == 1){
                System.out.println("Telefone\nOpções ");
                do{
                    System.out.println("0-Home | 1-Chamar | 2-Receber | 3-Correio de Voz");
                    option = sc.nextInt();
                    if(option == 1){
                        telephoneApp.call();
                    }else if(option == 2){
                        telephoneApp.answer();
                    }else if(option == 3){
                        telephoneApp.beginMailVoicer();
                    }else
                        System.out.println("Voltar para Home");
                }while(option >=1 && option <=3);
            }

            if(i == 2){
                System.out.println("Ipod\nOpções ");
                do{
                    System.out.println("0-Home | 1-Selecionar | 2-Reproduzir | 3-Pause");
                    option = sc.nextInt();
                    if(option == 1){
                        ipodApp.selectMusic();
                    }else if(option == 2){
                        ipodApp.playMusic();
                    }else if(option == 3){
                        ipodApp.pauseMusic();
                    }else
                        System.out.println("Voltar para Home");
                }while(option >=1 && option <=3);
            }

            if(i == 3){
                System.out.println("Internet\nOpções ");
                do{
                    System.out.println("0-Home | 1-Mostrar Pagina | 2-Adicionar Nova Aba | 3-Atualizar Pagina");
                    option = sc.nextInt();
                    if(option == 1){
                    internetApp.displayPage();
                    }else if(option == 2){
                        internetApp.addNewTab();
                    }else if(option == 3){
                        internetApp.updatePage();
                    }else
                        System.out.println("Home");
                    }while(option >=1 && option <=3);
            }
        }while(i>0 && i<4);

        System.out.println("Desligando Iphone");
        
        sc.close();
    }

   
}
