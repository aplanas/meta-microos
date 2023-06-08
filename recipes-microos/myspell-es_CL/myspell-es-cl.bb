SUMMARY = "MySpell es_CL Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_CL-20221012-1.2.noarch.rpm"
RPM_HASH = "2f6b3876ee38fd3808f4e5b3c8f40e6555b6111b565de95c96b7c0f187a06cefa73b09f8a957002cb46ac7bf62a1d832e907e7821d0209ae530ca13e093924c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_CL) locale(seamonkey-spellchecker:es_CL) myspell-dictionary myspell-es_CL myspell-spanish-chilean"
RDEPENDS:${PN} += "myspell-dictionaries myspell-es"

inherit rpm
