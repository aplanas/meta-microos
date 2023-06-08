SUMMARY = "MySpell en_TT Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_TT-20221012-1.2.noarch.rpm"
RPM_HASH = "a959a52b19a7447012689c149395f00ea5b7c41bbf3ab01384907daff025f4e1e07d2062e534b111f5a0c8be58eaba0a5387b151c65cbdf85ab155e99b66ca08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_TT) locale(seamonkey-spellchecker:en_TT) myspell-dictionary myspell-en_TT"
RDEPENDS:${PN} += "myspell-dictionaries myspell-en myspell-en_GB myspell-en_US"

inherit rpm
