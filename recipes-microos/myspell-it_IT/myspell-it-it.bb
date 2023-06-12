SUMMARY = "MySpell it_IT Dictionary"
DESCRIPTION = "Italian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-it_IT-20221012-1.2.noarch.rpm"
RPM_HASH = "dae1e232f3c143e983572e24a6ed400019928734e38093beb6c0b512d60a37869d8ad5e0c4db6285295a307d5f16baa4d895d97ac38312df19d00acfd8e85097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-it \
locale(libreoffice:it_IT) \
locale(seamonkey-spellchecker:it_IT) \
myspell-dictionary \
myspell-it_IT \
myspell-italian"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
