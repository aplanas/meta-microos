SUMMARY = "MySpell ru_RU Dictionary"
DESCRIPTION = "Russian spelling dictionary, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ru_RU-20221012-1.2.noarch.rpm"
RPM_HASH = "92fc6792a389badc616e6b4e3b5bc31ef5dc1fd2f7e4ff300780f49c93a7ea56b85e2292a3187128297d02f4389ebc6bf5177c1f7145c043bd239b0582dd6690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-ru locale(libreoffice:ru_RU) locale(seamonkey-spellchecker:ru_RU) myspell-dictionary myspell-ru_RU myspell-russian"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
