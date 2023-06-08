SUMMARY = "MySpell mn_MN Dictionary"
DESCRIPTION = "Mongolian spelling and hyphenation dictionaries."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-mn_MN-20221012-1.2.noarch.rpm"
RPM_HASH = "c698eff2ab712b9b452b7047b48c93230e9dda92276f9d0ccefc44d19f2878c172a75805f9912ea724843882bc7d32d2341c7912b312b84b8d39ebd44b974a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:mn_MN) locale(seamonkey-spellchecker:mn_MN) myspell-dictionary myspell-mn_MN"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
