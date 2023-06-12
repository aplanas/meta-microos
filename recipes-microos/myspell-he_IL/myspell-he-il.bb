SUMMARY = "MySpell he_IL Dictionary"
DESCRIPTION = "Hebrew spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-he_IL-20221012-1.2.noarch.rpm"
RPM_HASH = "329dd6b3bcf35355d1a5d8fe7966d5499118d0be4c3df0fd15ac3887dc1d488ebf3b8307c689b92bcd612b8f488434ed39d1eefa51560c2047aba7fd870704cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:he_IL) \
locale(seamonkey-spellchecker:he_IL) \
myspell-dictionary \
myspell-he_IL \
myspell-hebrew"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
