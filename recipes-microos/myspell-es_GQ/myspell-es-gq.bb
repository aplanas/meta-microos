SUMMARY = "MySpell es_GQ Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_GQ-20221012-1.2.noarch.rpm"
RPM_HASH = "c50b11fdf44ef93115b0fd3a021870da14e32c71e7c424c9cc3fb1434f6dd6929f4141317022981801529633b85809fa2d023aabcb1ac691169e10bed5a82a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_GQ) locale(seamonkey-spellchecker:es_GQ) myspell-dictionary myspell-es_GQ"
RDEPENDS:${PN} += "myspell-dictionaries myspell-es"

inherit rpm
