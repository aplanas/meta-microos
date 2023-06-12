SUMMARY = "MySpell fr_MC Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fr_MC-20221012-1.2.noarch.rpm"
RPM_HASH = "d494e56a6cc47611d9b9210792e2ff2a8514846808a3ea2e59041ad1110c5dac229120a39ef536887de13782e5e3ce42bdae82244cad1d7a2a2b5d8369913b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:fr_MC) \
locale(seamonkey-spellchecker:fr_MC) \
myspell-dictionary \
myspell-fr_MC"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr_FR"

inherit rpm
