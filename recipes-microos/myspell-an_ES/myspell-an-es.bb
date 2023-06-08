SUMMARY = "MySpell an_ES Dictionary"
DESCRIPTION = "Aragonese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-an_ES-20221012-1.2.noarch.rpm"
RPM_HASH = "822dd8e81955e34b336fe83bc2d4f1cdff4ac2d357ed6f1a3b319a06375ebb4154595edbbf594f0cd03c779f9653c0f1bee13107962a647c94d4f3a3a1e7be66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:an_ES) locale(seamonkey-spellchecker:an_ES) myspell-an_ES myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
