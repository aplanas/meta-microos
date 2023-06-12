SUMMARY = "MySpell ko_KR Dictionary"
DESCRIPTION = "Korean spellcheck dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ko_KR-20221012-1.2.noarch.rpm"
RPM_HASH = "e0a8968dac8b827cc29df30284383ca4cc04a72ad6bf2f832a4db5819b394b4c36292c6cece6c192719b23515995304e7059f188939b169b11c1249a7253b752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ko_KR) \
locale(seamonkey-spellchecker:ko_KR) \
myspell-dictionary \
myspell-ko_KR"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
