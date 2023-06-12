SUMMARY = "MySpell es Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es-20221012-1.2.noarch.rpm"
RPM_HASH = "66487d39f97597a8c729eb1c26fe78e298238be41cf6f1b8167b07b4d7783e96a60a6bbbc7289ad836ed034691ffdd667bc7597d2c3ba2728768edde1186bd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es) \
locale(seamonkey-spellchecker:es) \
myspell-dictionary \
myspell-es"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
