SUMMARY = "MySpell en_CA Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_CA-20221012-1.2.noarch.rpm"
RPM_HASH = "bc3ac83279e3efd83e121ac75a08b15c26a9587c699a917aaf699ce2716bc7987cf98626d75abe29268902fe099b40b25861960b688038a0d276675671b35a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_CA) \
locale(seamonkey-spellchecker:en_CA) \
myspell-canadian \
myspell-dictionary \
myspell-en_CA"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_GB \
myspell-en_US"

inherit rpm
