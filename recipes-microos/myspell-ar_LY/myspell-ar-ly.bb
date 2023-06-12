SUMMARY = "MySpell ar_LY Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_LY-20221012-1.2.noarch.rpm"
RPM_HASH = "05f7e8fae409e019a8dafb48e7f4a8e2b09223ad01f9a953f5f89823e4664108ed14ad8a6f5c7f2e745eff2d9a49e5dab58b0e6cda3c58904f93555146d0d791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_LY) \
locale(seamonkey-spellchecker:ar_LY) \
myspell-ar_LY \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
