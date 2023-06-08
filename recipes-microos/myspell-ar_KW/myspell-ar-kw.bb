SUMMARY = "MySpell ar_KW Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_KW-20221012-1.2.noarch.rpm"
RPM_HASH = "5e7b02ad048b2b3d4fcd9249d71c0cd5333490618afa2f4d109c784f9a8a8f93c44677aac6080b8e2ee10eb4387b0ca64b90706b7198dae52d8d1db7c62d24ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_KW) locale(seamonkey-spellchecker:ar_KW) myspell-ar_KW myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar myspell-dictionaries"

inherit rpm
