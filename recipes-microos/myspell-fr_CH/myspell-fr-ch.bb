SUMMARY = "MySpell fr_CH Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fr_CH-20221012-1.2.noarch.rpm"
RPM_HASH = "df2d3200ff35115ae421252f60247d5279fd11833a2c32f3671efe0cc8324cd633ff7e3311222e1052ff1cac69ce2becfe5c0efb19001224c7b72f17b9893b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:fr_CH) \
locale(seamonkey-spellchecker:fr_CH) \
myspell-dictionary \
myspell-fr_CH"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr_FR"

inherit rpm
