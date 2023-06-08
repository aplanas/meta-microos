SUMMARY = "Soundfont and MIDI Sample"
DESCRIPTION = "This package contains the following sound fonts: Vintage Dreams Waves v \
2.0. by Ian Wilson and GeneralUser 1.1 by Samuel Collins. Vintage \
Dreams Waves features 128 analog synthesizer patches and 8 drum kits. \
The sound font can be used with Sound Blaster AWE and SB Live! sound \
cards. The package also provides a sample MIDI file for this sound \
font. The ROM sound font GeneralUser 1.1 only works with SB AWE \
soundcards. It is General MIDI compatible."
LICENSE = "SUSE-Freeware"

PV = "0.1.2"

RPM_NAME = "snd_sf2-0.1.2-681.14.noarch.rpm"
RPM_HASH = "8f05385bc9a51db7653f2372f2d074d68f418ad2d43c271f53e14b1722bb619372d145ddfeaf239709bc7d87f8702b9cb348b203a2618ec18200dc7273aacfe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "snd_sf2 soundfont"
RDEPENDS:${PN} += "awesfx"

inherit rpm
