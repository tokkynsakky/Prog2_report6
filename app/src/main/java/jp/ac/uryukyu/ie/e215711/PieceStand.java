package jp.ac.uryukyu.ie.e215711;

import java.util.LinkedHashMap;

public class PieceStand {
    LinkedHashMap<String, String> obtainedPiece(String destinationPlacePiece, LinkedHashMap<String, String> pieceStand, int getOrder){
        //LinkedHashMap<String, String> pieceStand = new LinkedHashMap<>();
        String pieceidentifier = "";
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        if(!(destinationPlacePiece.equals("＿"))){
            System.out.println(destinationPlacePiece+"が取得されました");
            if(get.getOwner(destinationPlacePiece).equals("A")){
                Devolution devo = new Devolution();
                pieceidentifier = devo.devolution(get.getPiece(destinationPlacePiece)) + "B" + get.getEvolutionCapability(destinationPlacePiece) + "非" + get.getKingidengifier(destinationPlacePiece);

                pieceStand.put(get.getOwner(pieceidentifier)+getOrder, pieceidentifier);
            }else if(get.getOwner(destinationPlacePiece).equals("B")){
                Devolution devo = new Devolution();
                pieceidentifier = devo.devolution(get.getPiece(destinationPlacePiece)) + "A" + get.getEvolutionCapability(destinationPlacePiece) + "非" + get.getKingidengifier(destinationPlacePiece);

                pieceStand.put(get.getOwner(pieceidentifier)+getOrder, pieceidentifier);
            }else{
            }
            //System.out.println(pieceidentifier+"これはPieceIdentifier");
        }
        return pieceStand;
    }
}