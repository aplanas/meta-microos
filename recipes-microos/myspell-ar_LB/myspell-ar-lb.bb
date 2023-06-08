SUMMARY = "MySpell ar_LB Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_LB-20221012-1.2.noarch.rpm"
RPM_HASH = "1263096d97afa836145647f26a7b01fae5ae653fded833d0507e34fbf49fc1b5e810242beea65fe34db3c322a0ccacefd6d70c19b3b4ff8e902ededafb09ca33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_LB) locale(seamonkey-spellchecker:ar_LB) myspell-ar_LB myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar myspell-dictionaries"

inherit rpm
