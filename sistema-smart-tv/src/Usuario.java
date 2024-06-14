public class Usuario {

    public static void main(String[] args) throws Exception {

       SmartTv smartTv = new SmartTv();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentaVolume();

       System.out.println("Canal Atual :" + smartTv.canal);

       smartTv.mudarCanal(13);
       
       System.out.println("Canal Atual :" + smartTv.canal);

       System.out.println("Volume Atual :" +smartTv.ligada);



       System.out.println("TV LIGADA ?" + smartTv.ligada);
       System.out.println("VOLUME Atual :" + smartTv.volume);

       smartTv.ligar ();
       System.out.println("Novo status -TV LIGADA ?" + smartTv.ligada);
       smartTv.desligar ();
       System.out.println("Novo status -TV LIGADA ?" + smartTv.ligada);

    }
}