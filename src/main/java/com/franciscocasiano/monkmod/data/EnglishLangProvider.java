package com.franciscocasiano.monkmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static com.franciscocasiano.monkmod.MonkMod.*;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

//        Weapons
        translationBuilder.add(QUARTERSTAFF, "Quarterstaff");
        translationBuilder.add(THROWING_STAR, "Throwing Star");
        translationBuilder.add(NUNCHUCK, "Nunchuck");
        translationBuilder.add(HAND_WRAPS, "Hand Wraps");
        translationBuilder.add(ROPE_DART, "Rope Dart");
        translationBuilder.add(BLOWGUN, "Blowgun");
        translationBuilder.add(DART, "Dart");
    }
}
