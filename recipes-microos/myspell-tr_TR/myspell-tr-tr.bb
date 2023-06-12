SUMMARY = "MySpell tr_TR Dictionary"
DESCRIPTION = "Turkish Spellcheck Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-tr_TR-20221012-1.2.noarch.rpm"
RPM_HASH = "da2ad39a288c0f476fd29e1f800ced7957954c5221b72fb9e5e676ea388d31b9b8eda49976e503a023042df623897275890814a0f87b406e868094660800d943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:tr_TR) \
locale(seamonkey-spellchecker:tr_TR) \
myspell-dictionary \
myspell-tr_TR"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
