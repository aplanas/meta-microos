SUMMARY = "MySpell sr_Latn_CS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sr_Latn_CS-20221012-1.2.noarch.rpm"
RPM_HASH = "44bea390ac3910a1158f764d5d2aee66bacbee7c76e52cc077c5375eef67bdf0c85bbb13537d6f5bb6d3a520e9e7746d2247582f024f75f501695722b0edd606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:sr_Latn_CS) locale(seamonkey-spellchecker:sr_Latn_CS) myspell-dictionary myspell-sr_Latn_CS"
RDEPENDS:${PN} += "myspell-dictionaries myspell-sr"

inherit rpm
