package com.example.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public class ModulesScreen extends Screen {
    public ModulesScreen() {
        super(Text.literal("TurkSultan Menu"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(this.textRenderer, "§6§lTurkSultan Client - Modüller", this.width / 2, 20, 0xFFFFFF);
        
        int x = this.width / 2 - 60;
        context.drawTextWithShadow(this.textRenderer, "§a[+] Yüksek Zıplama (Aktif)", x, 60, 0xFFFFFF);
        context.drawTextWithShadow(this.textRenderer, "§c[-] Uçma / Fly (Pasif)", x, 80, 0xFFFFFF);
        context.drawTextWithShadow(this.textRenderer, "§c[-] Hızlı Koşma (Pasif)", x, 100, 0xFFFFFF);

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
