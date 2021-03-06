// Date: 30.05.2013 09:02:55
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelBee extends ModelBase
{
  //fields
    ModelRenderer Snout;
    ModelRenderer TorsoWing;
    ModelRenderer Rump;
    ModelRenderer Tail;
    ModelRenderer TailEnd;
    ModelRenderer Bridge;
    ModelRenderer EyeRight;
    ModelRenderer EyeLeft;
    ModelRenderer WingLeft;
    ModelRenderer WingRight;
    ModelRenderer crown;
  
  public ModelBee()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Snout = new ModelRenderer(this, 18, 11);
      Snout.addBox(0F, 0F, 0F, 1, 2, 1);
      Snout.setRotationPoint(0F, 1F, -2F);
      Snout.setTextureSize(64, 32);
      Snout.mirror = true;
      setRotation(Snout, 0F, 0F, 0F);
      TorsoWing = new ModelRenderer(this, 28, 14);
      TorsoWing.addBox(0F, 0F, 0F, 3, 3, 1);
      TorsoWing.setRotationPoint(-1F, 0F, -1F);
      TorsoWing.setTextureSize(64, 32);
      TorsoWing.mirror = true;
      setRotation(TorsoWing, 0F, 0F, 0F);
      Rump = new ModelRenderer(this, 10, 14);
      Rump.addBox(-1F, -1F, 0F, 3, 3, 3);
      Rump.setRotationPoint(0F, 1F, 1F);
      Rump.setTextureSize(64, 32);
      Rump.mirror = true;
      setRotation(Rump, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 4, 14);
      Tail.addBox(0F, 0F, 0F, 2, 2, 1);
      Tail.setRotationPoint(-0.5F, 0.5333334F, 4F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      TailEnd = new ModelRenderer(this, 0, 14);
      TailEnd.addBox(0F, 0F, 0F, 1, 1, 1);
      TailEnd.setRotationPoint(0F, 1F, 5F);
      TailEnd.setTextureSize(64, 32);
      TailEnd.mirror = true;
      setRotation(TailEnd, 0F, 0F, 0F);
      Bridge = new ModelRenderer(this, 22, 14);
      Bridge.addBox(0F, 0F, 0F, 2, 2, 1);
      Bridge.setRotationPoint(-0.5F, 0.5F, 0F);
      Bridge.setTextureSize(64, 32);
      Bridge.mirror = true;
      setRotation(Bridge, 0F, 0F, 0F);
      EyeRight = new ModelRenderer(this, 22, 9);
      EyeRight.addBox(0F, 0F, 0F, 1, 1, 1);
      EyeRight.setRotationPoint(-1F, 0F, -2F);
      EyeRight.setTextureSize(64, 32);
      EyeRight.mirror = true;
      setRotation(EyeRight, 0F, 0F, 0F);
      EyeLeft = new ModelRenderer(this, 18, 9);
      EyeLeft.addBox(0F, 0F, 0F, 1, 1, 1);
      EyeLeft.setRotationPoint(1F, 0F, -2F);
      EyeLeft.setTextureSize(64, 32);
      EyeLeft.mirror = true;
      setRotation(EyeLeft, 0F, 0F, 0F);
      WingLeft = new ModelRenderer(this, 0, 0);
      WingLeft.addBox(0F, 0F, 0F, 3, 1, 6);
      WingLeft.setRotationPoint(1F, -0.1F, -0.5F);
      WingLeft.setTextureSize(64, 32);
      WingLeft.mirror = true;
      setRotation(WingLeft, 0F, 0F, 0F);
      WingRight = new ModelRenderer(this, 0, 7);
      WingRight.addBox(-3F, 0F, 0F, 3, 1, 6);
      WingRight.setRotationPoint(0F, -0.1F, -0.5F);
      WingRight.setTextureSize(64, 32);
      WingRight.mirror = true;
      setRotation(WingRight, 0F, 0F, 0F);
      crown = new ModelRenderer(this, 0, 17);
      crown.addBox(0F, 0F, 0F, 2, 1, 2);
      crown.setRotationPoint(-0.5F, -1.5F, -1.5F);
      crown.setTextureSize(64, 32);
      crown.mirror = true;
      setRotation(crown, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Snout.render(f5);
    TorsoWing.render(f5);
    Rump.render(f5);
    Tail.render(f5);
    TailEnd.render(f5);
    Bridge.render(f5);
    EyeRight.render(f5);
    EyeLeft.render(f5);
    WingLeft.render(f5);
    WingRight.render(f5);
    crown.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
