SUMMARY = "MySpell is Dictionary"
DESCRIPTION = "Icelandic spelling dictionary, hyphenation rules and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-is-20221012-1.2.noarch.rpm"
RPM_HASH = "37faee183485c8a3e5dc393e9f1049f4d0834b630dc6e8aed6c50c5c400d822e0c3a68ea03b6561c6029d8a137f77dae20b5b713b32fcc3772d2d987c27cc497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:is) locale(seamonkey-spellchecker:is) myspell-dictionary myspell-icelandic myspell-is"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
