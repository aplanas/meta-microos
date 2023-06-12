SUMMARY = "MySpell gu_IN Dictionary"
DESCRIPTION = "Gujarati spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-gu_IN-20221012-1.2.noarch.rpm"
RPM_HASH = "b9484dce3d1c92ca02a74a2e3a87c0224e4a6649ac0ae8db2d05865b0da2ada19aa06a505601a1c6686b0fb77959c1b436ff7614da96c4cf6aa3004e72433bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:gu_IN) \
locale(seamonkey-spellchecker:gu_IN) \
myspell-dictionary \
myspell-gu_IN \
myspell-gujarati"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
