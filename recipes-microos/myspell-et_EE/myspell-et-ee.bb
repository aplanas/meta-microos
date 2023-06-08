SUMMARY = "MySpell et_EE Dictionary"
DESCRIPTION = "Estonian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-et_EE-20221012-1.2.noarch.rpm"
RPM_HASH = "000dd608c44c686b6b983cd5dd6accdc55748e01bca240ca36c27186be47b663fef4209204323c7d8ce83eaaf3dd88cabd9c7e9e9cc5110ba1a472eda8c3bd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:et_EE) locale(seamonkey-spellchecker:et_EE) myspell-dictionary myspell-estonian myspell-et_EE"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
