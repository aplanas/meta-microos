SUMMARY = "All Noto Fonts except CJK and Emoji"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
most noto fonts except for CJK and Emoji."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1c85555d22b9b8e766fb023cf7812212b4dc795505c0648be76ebb775f01b73bacf700f2ce2120bd1e453eb09c60c6e81351625b6b9b8e03ea6fd2a155c13cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-fonts"
RDEPENDS:${PN} += "noto-arimo-fonts \
noto-cousine-fonts \
noto-kufiarabic-fonts \
noto-loopedlao-fonts \
noto-loopedlao-ui-fonts \
noto-loopedthai-fonts \
noto-loopedthai-ui-fonts \
noto-music-fonts \
noto-naskharabic-fonts \
noto-naskharabic-ui-fonts \
noto-nastaliqurdu-fonts \
noto-rashihebrew-fonts \
noto-sans-adlam-fonts \
noto-sans-adlamunjoined-fonts \
noto-sans-anatolianhieroglyphs-fonts \
noto-sans-arabic-fonts \
noto-sans-arabic-ui-fonts \
noto-sans-armenian-fonts \
noto-sans-avestan-fonts \
noto-sans-balinese-fonts \
noto-sans-bamum-fonts \
noto-sans-bassavah-fonts \
noto-sans-batak-fonts \
noto-sans-bengali-fonts \
noto-sans-bengali-ui-fonts \
noto-sans-bhaiksuki-fonts \
noto-sans-brahmi-fonts \
noto-sans-buginese-fonts \
noto-sans-buhid-fonts \
noto-sans-canadianaboriginal-fonts \
noto-sans-carian-fonts \
noto-sans-caucasianalbanian-fonts \
noto-sans-chakma-fonts \
noto-sans-cham-fonts \
noto-sans-cherokee-fonts \
noto-sans-chorasmian-fonts \
noto-sans-coptic-fonts \
noto-sans-cuneiform-fonts \
noto-sans-cypriot-fonts \
noto-sans-cyprominoan-fonts \
noto-sans-deseret-fonts \
noto-sans-devanagari-fonts \
noto-sans-devanagari-ui-fonts \
noto-sans-duployan-fonts \
noto-sans-egyptianhieroglyphs-fonts \
noto-sans-elbasan-fonts \
noto-sans-elymaic-fonts \
noto-sans-ethiopic-fonts \
noto-sans-fonts \
noto-sans-georgian-fonts \
noto-sans-glagolitic-fonts \
noto-sans-gothic-fonts \
noto-sans-grantha-fonts \
noto-sans-gujarati-fonts \
noto-sans-gujarati-ui-fonts \
noto-sans-gunjalagondi-fonts \
noto-sans-gurmukhi-fonts \
noto-sans-gurmukhi-ui-fonts \
noto-sans-hanifirohingya-fonts \
noto-sans-hanunoo-fonts \
noto-sans-hatran-fonts \
noto-sans-hebrew-fonts \
noto-sans-hebrewdroid-fonts \
noto-sans-hebrewnew-fonts \
noto-sans-imperialaramaic-fonts \
noto-sans-indicsiyaqnumbers-fonts \
noto-sans-inscriptionalpahlavi-fonts \
noto-sans-inscriptionalparthian-fonts \
noto-sans-javanese-fonts \
noto-sans-kaithi-fonts \
noto-sans-kannada-fonts \
noto-sans-kannada-ui-fonts \
noto-sans-kayahli-fonts \
noto-sans-kharoshthi-fonts \
noto-sans-khmer-fonts \
noto-sans-khmer-ui-fonts \
noto-sans-khojki-fonts \
noto-sans-khudawadi-fonts \
noto-sans-lao-fonts \
noto-sans-lao-ui-fonts \
noto-sans-lepcha-fonts \
noto-sans-limbu-fonts \
noto-sans-lineara-fonts \
noto-sans-linearb-fonts \
noto-sans-lisu-fonts \
noto-sans-lycian-fonts \
noto-sans-lydian-fonts \
noto-sans-mahajani-fonts \
noto-sans-malayalam-fonts \
noto-sans-malayalam-ui-fonts \
noto-sans-mandaic-fonts \
noto-sans-manichaean-fonts \
noto-sans-marchen-fonts \
noto-sans-masaramgondi-fonts \
noto-sans-math-fonts \
noto-sans-mayannumerals-fonts \
noto-sans-medefaidrin-fonts \
noto-sans-meeteimayek-fonts \
noto-sans-mendekikakui-fonts \
noto-sans-meroitic-fonts \
noto-sans-miao-fonts \
noto-sans-modi-fonts \
noto-sans-mongolian-fonts \
noto-sans-mono-fonts \
noto-sans-mro-fonts \
noto-sans-multani-fonts \
noto-sans-myanmar-fonts \
noto-sans-myanmar-ui-fonts \
noto-sans-nabataean-fonts \
noto-sans-nandinagari-fonts \
noto-sans-newa-fonts \
noto-sans-newtailue-fonts \
noto-sans-nko-fonts \
noto-sans-nushu-fonts \
noto-sans-ogham-fonts \
noto-sans-olchiki-fonts \
noto-sans-oldhungarian-fonts \
noto-sans-olditalic-fonts \
noto-sans-oldnortharabian-fonts \
noto-sans-oldpermic-fonts \
noto-sans-oldpersian-fonts \
noto-sans-oldsogdian-fonts \
noto-sans-oldsoutharabian-fonts \
noto-sans-oldturkic-fonts \
noto-sans-oriya-fonts \
noto-sans-oriya-ui-fonts \
noto-sans-osage-fonts \
noto-sans-osmanya-fonts \
noto-sans-pahawhhmong-fonts \
noto-sans-palmyrene-fonts \
noto-sans-paucinhau-fonts \
noto-sans-phagspa-fonts \
noto-sans-phoenician-fonts \
noto-sans-psalterpahlavi-fonts \
noto-sans-rejang-fonts \
noto-sans-runic-fonts \
noto-sans-samaritan-fonts \
noto-sans-saurashtra-fonts \
noto-sans-sharada-fonts \
noto-sans-shavian-fonts \
noto-sans-siddham-fonts \
noto-sans-signwriting-fonts \
noto-sans-sinhala-fonts \
noto-sans-sinhala-ui-fonts \
noto-sans-sogdian-fonts \
noto-sans-sorasompeng-fonts \
noto-sans-soyombo-fonts \
noto-sans-sundanese-fonts \
noto-sans-sylotinagri-fonts \
noto-sans-symbols-fonts \
noto-sans-symbols2-fonts \
noto-sans-syriac-fonts \
noto-sans-tagalog-fonts \
noto-sans-tagbanwa-fonts \
noto-sans-taile-fonts \
noto-sans-taitham-fonts \
noto-sans-taiviet-fonts \
noto-sans-takri-fonts \
noto-sans-tamil-fonts \
noto-sans-tamil-ui-fonts \
noto-sans-tamilsupplement-fonts \
noto-sans-tangsa-fonts \
noto-sans-telugu-fonts \
noto-sans-telugu-ui-fonts \
noto-sans-thaana-fonts \
noto-sans-thai-fonts \
noto-sans-thai-ui-fonts \
noto-sans-tifinagh-fonts \
noto-sans-tifinaghadrar-fonts \
noto-sans-tifinaghagrawimazighen-fonts \
noto-sans-tifinaghahaggar-fonts \
noto-sans-tifinaghair-fonts \
noto-sans-tifinaghapt-fonts \
noto-sans-tifinaghazawagh-fonts \
noto-sans-tifinaghghat-fonts \
noto-sans-tifinaghhawad-fonts \
noto-sans-tifinaghrhissaixa-fonts \
noto-sans-tifinaghsil-fonts \
noto-sans-tifinaghtawellemmet-fonts \
noto-sans-tirhuta-fonts \
noto-sans-ugaritic-fonts \
noto-sans-vai-fonts \
noto-sans-vithkuqi-fonts \
noto-sans-wancho-fonts \
noto-sans-warangciti-fonts \
noto-sans-yi-fonts \
noto-sans-zanabazarsquare-fonts \
noto-serif-ahom-fonts \
noto-serif-armenian-fonts \
noto-serif-balinese-fonts \
noto-serif-bengali-fonts \
noto-serif-devanagari-fonts \
noto-serif-display-fonts \
noto-serif-divesakuru-fonts \
noto-serif-dogra-fonts \
noto-serif-ethiopic-fonts \
noto-serif-fonts \
noto-serif-georgian-fonts \
noto-serif-grantha-fonts \
noto-serif-gujarati-fonts \
noto-serif-gurmukhi-fonts \
noto-serif-hebrew-fonts \
noto-serif-kannada-fonts \
noto-serif-khmer-fonts \
noto-serif-khojki-fonts \
noto-serif-lao-fonts \
noto-serif-makasar-fonts \
noto-serif-malayalam-fonts \
noto-serif-myanmar-fonts \
noto-serif-nyiakengpuachuehmong-fonts \
noto-serif-olduyghur-fonts \
noto-serif-oriya-fonts \
noto-serif-sinhala-fonts \
noto-serif-tamil-fonts \
noto-serif-tamilslanted-fonts \
noto-serif-tangut-fonts \
noto-serif-telugu-fonts \
noto-serif-thai-fonts \
noto-serif-tibetan-fonts \
noto-serif-toto-fonts \
noto-serif-vithkuqi-fonts \
noto-serif-yezidi-fonts \
noto-tinos-fonts \
noto-traditionalnushu-fonts"

inherit rpm
