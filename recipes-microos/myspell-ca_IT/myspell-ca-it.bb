SUMMARY = "MySpell ca_IT Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ca_IT-20221012-1.2.noarch.rpm"
RPM_HASH = "be3bcfa8a3279bcf04b42b5f3dc4d402d635292dd8e86bd1c8613db50b80707731169c5794332ae7207a8d43301857b01924b5807a02831be8e33a8501770d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ca_IT) \
locale(seamonkey-spellchecker:ca_IT) \
myspell-ca_IT \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
