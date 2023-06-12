SUMMARY = "MySpell de_DE Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-de_DE-20221012-1.2.noarch.rpm"
RPM_HASH = "a33d099b3f8ebd58b3cc9ad130236c92cdb1ae39341e40d744b73dd80b680cac022f7a56de7a4fc24e2f6337b25c0b0a4cf20251adfeb6ece18e4a38bb0e72d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:de_DE) \
locale(seamonkey-spellchecker:de_DE) \
myspell-de_DE \
myspell-dictionary \
myspell-german"
RDEPENDS:${PN} += "myspell-de \
myspell-dictionaries"

inherit rpm
