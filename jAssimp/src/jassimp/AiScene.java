/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassimp;

import jassimp.material.AiMaterial;

/**
 *
 * @author gbarbieri
 */
public class AiScene {
    
    public int mNumMaterials;
    public AiNode mRootNode;
    public AiMaterial[] mMaterial;
    public int mNumMeshes;
    public AiMesh[] mMeshes;
}
