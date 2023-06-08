SUMMARY = "MySpell oc_FR Dictionary"
DESCRIPTION = "Occitan spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-oc_FR-20221012-1.2.noarch.rpm"
RPM_HASH = "b389f3070b98cfb2d467cf87a8d1120035ae58534c732e7a141ac7cf45bd5aa54541d0265b4e009317289ce785b6d37def020090001d9c2b07350a14b9e77693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:oc_FR) locale(seamonkey-spellchecker:oc_FR) myspell-dictionary myspell-oc_FR myspell-occitan-lengadocian"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
