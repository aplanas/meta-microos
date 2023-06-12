SUMMARY = "MySpell an Dictionary"
DESCRIPTION = "Aragonese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-an-20221012-1.2.noarch.rpm"
RPM_HASH = "d1a21b6d9ab42f43c7bcb8fbef310edbaa234201b309138f817be504ead1b641251c02c71ee8b6a93de1557bfa970cd680854f73e202c2aed8369dc2592c4ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:an) \
locale(seamonkey-spellchecker:an) \
myspell-an \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-an_ES \
myspell-dictionaries"

inherit rpm
