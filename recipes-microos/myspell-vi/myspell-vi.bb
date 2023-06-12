SUMMARY = "MySpell vi Dictionary"
DESCRIPTION = "Vietnamese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-vi-20221012-1.2.noarch.rpm"
RPM_HASH = "a963366ffc1e8a4ea75f78c609223141ac7c8f241f42abeaea4995bf96c74b8708e458730b0e0198b1ea1cfa52e47abdcc9cd5da175b3b8d0abbe724588def01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:vi) \
locale(seamonkey-spellchecker:vi) \
myspell-dictionary \
myspell-vi \
myspell-vietnamese"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
