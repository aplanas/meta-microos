SUMMARY = "MySpell en_IN Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_IN-20221012-1.2.noarch.rpm"
RPM_HASH = "2cc8a0f0e7cd131f97e22e713e8d54531f5286bbc8bf2697bdd94eec6b7049e425572bcad4c87408bb14df18a84facb8a1d229bc8b1145414e5646aab617211c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_IN) \
locale(seamonkey-spellchecker:en_IN) \
myspell-dictionary \
myspell-en_IN"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_GB \
myspell-en_US"

inherit rpm
