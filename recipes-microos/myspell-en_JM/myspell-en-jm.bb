SUMMARY = "MySpell en_JM Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_JM-20221012-1.2.noarch.rpm"
RPM_HASH = "2c5260e6f67cfabc4664d768a68987ad9eff4e84d807c1d97ade42295f4da84efafcc7bef7db01cda6a55f6f949330fd4947541f7d88bca83f0fc83827ae8c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_JM) locale(seamonkey-spellchecker:en_JM) myspell-dictionary myspell-en_JM"
RDEPENDS:${PN} += "myspell-dictionaries myspell-en myspell-en_GB myspell-en_US"

inherit rpm
