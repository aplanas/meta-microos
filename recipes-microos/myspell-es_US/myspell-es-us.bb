SUMMARY = "MySpell es_US Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_US-20221012-1.2.noarch.rpm"
RPM_HASH = "5ae654db088fdf84505f9522be335c35a28c72c8627ce60f4746bba080dac364859988e8ffa9d8f70dbe347eb5624ea9b30e354d8f633948e7f2ac871d02db43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_US) locale(seamonkey-spellchecker:es_US) myspell-dictionary myspell-es_US"
RDEPENDS:${PN} += "myspell-dictionaries myspell-es"

inherit rpm
