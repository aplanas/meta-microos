SUMMARY = "MySpell cs_CZ Dictionary"
DESCRIPTION = "Czech spell check dictionary, hyphenation rules and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-cs_CZ-20221012-1.2.noarch.rpm"
RPM_HASH = "76a6be78516f03de0a248bca3a4b535ca8aa8478fbf65e9bb5832e4db47b131fd6a52a87f8c6be9f53235b76b429eaeeb5e48b3df41822670230216e77c9d77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-cs locale(libreoffice:cs_CZ) locale(seamonkey-spellchecker:cs_CZ) myspell-cs_CZ myspell-czech myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
