SUMMARY = "MySpell ar_MA Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_MA-20221012-1.2.noarch.rpm"
RPM_HASH = "7db021526c0888dea4f4a0d1006e830c7e700c182f90a72c294b966c6b4f317f8a0f95d92e7c7a818f81d168448d4d5573639de572bc310275fb24b7e9503150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_MA) \
locale(seamonkey-spellchecker:ar_MA) \
myspell-ar_MA \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
