SUMMARY = "MySpell sr_CS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sr_CS-20221012-1.2.noarch.rpm"
RPM_HASH = "4ea5430a00f44b8eed983266f43cdbad997dac535e24677cd7356229bd95597865735823517387e07c50cf037c5f0c44455f838f8e4a8490587e8093fd2697ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:sr_CS) locale(seamonkey-spellchecker:sr_CS) myspell-dictionary myspell-sr_CS"
RDEPENDS:${PN} += "myspell-dictionaries myspell-sr"

inherit rpm
