SUMMARY = "MySpell es_VE Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_VE-20221012-1.2.noarch.rpm"
RPM_HASH = "231244d20bfc9faf76864cf375c02885b7f8b123b936607f5dd0009c9793b3399f1c75bfeb0edfdfb2653ef648f699c8caa7fca30d07a9a7c91b3a4a4937cd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_VE) locale(seamonkey-spellchecker:es_VE) myspell-dictionary myspell-es_VE myspell-spanish-venezuelan"
RDEPENDS:${PN} += "myspell-dictionaries myspell-es"

inherit rpm
