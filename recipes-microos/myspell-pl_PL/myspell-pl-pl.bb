SUMMARY = "MySpell pl_PL Dictionary"
DESCRIPTION = "Polish spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-pl_PL-20221012-1.2.noarch.rpm"
RPM_HASH = "38940ab089a81c39a66b7c418154eaf108d655d7db37a974c8d9a59166db7a26c0109a2f485338bc145451a0795f1e41d51ece8b451dfd4e44c8457b6b6265b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-pl locale(libreoffice:pl_PL) locale(seamonkey-spellchecker:pl_PL) myspell-dictionary myspell-pl_PL myspell-polish"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
