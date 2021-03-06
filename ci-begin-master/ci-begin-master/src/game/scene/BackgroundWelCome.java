package game.scene;

import game.Background;
import game.GameObject;
import game.GameWindow;
import game.Settings;
import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

public class BackgroundWelCome extends GameObject {
    public BackgroundWelCome(){
        this.renderer = new SingleImageRenderer(SpriteUtils.loadImage("assets\\images\\background\\backgroundwelcome.jpg"));
        this.position.set(Settings.SCREEN_WIDTH/2, Settings.SCREEN_HEIGHT/2);
    }

    @Override
    public void run() {
        super.run();
        if (GameWindow.isAnyKeyPress){
            SceneManager.signNewScene(new SceneStage1());
        }
    }
}
