SUMMARY = "MySpell nb_NO Dictionary"
DESCRIPTION = "Norwegian (Nynorsk and Bokmål) spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-nb_NO-20221012-1.2.noarch.rpm"
RPM_HASH = "d290a068730a9fcecd580cd8e234fcb960ff4657288325a2774541336ea279726334c9527aedd5ce12b5f397ef435822b794b2e9579c1ab7f0bdcbba10fdc6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:nb_NO) locale(seamonkey-spellchecker:nb_NO) myspell-dictionary myspell-nb_NO myspell-norsk-bokmaal"
RDEPENDS:${PN} += "myspell-dictionaries myspell-no"

inherit rpm
