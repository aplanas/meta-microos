SUMMARY = "MySpell ca Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ca-20221012-1.2.noarch.rpm"
RPM_HASH = "0063eebe34cf64a7557ad7620d23565c2f86bdf226f48b18b49dadf3e8dca12dc8ffb13c307984af97dead7ed3c17977b1961e50a9106b8c5824ca5f3a3e0ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-ca locale(libreoffice:ca) locale(seamonkey-spellchecker:ca) myspell-ca myspell-catalan myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
