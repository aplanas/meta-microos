SUMMARY = "MySpell es_UY Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_UY-20221012-1.2.noarch.rpm"
RPM_HASH = "e679c0acab1752a6492bffdc2d8c285444b630d265009d5f477afd861c43eb44162783d7e635ca90ffa94c13a799a2223f59279442f7b33fd539f85a115adde8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_UY) \
locale(seamonkey-spellchecker:es_UY) \
myspell-dictionary \
myspell-es_UY \
myspell-spanish-uruguayan"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
