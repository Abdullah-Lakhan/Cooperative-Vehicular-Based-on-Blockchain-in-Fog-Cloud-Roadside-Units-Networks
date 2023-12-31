RSITS Road Cooperative Blockchain Framework

public class BlockchainDemo {

    public static void main(String[] args) {
         String vehicle="vehicle-1: is amazing car";
         String Fog node=null;
         String Cloud Node=null;
        Blockchain blockchain = new Blockchain();
        blockchain.addBlock(new String[]{"Vehicle Data Offload to Fog Server".Vehicle});
        Fog node=vehicle;
        blockchain.addBlock(new String[]{"Fog Node Recieve Data from Vehicle".Fog Node});
        Cloud=Fog node;

        blockchain.addBlock(new String[]{"Cloud Recieve Fog Node data of vehicle".Cloud});
        
        System.out.println("Blocks hash:");
        for(Block block : blockchain.getBlocks()) {
            System.out.println("block #" + block.getIndex()  + ": " + block.getHash());
        }
    }
}
