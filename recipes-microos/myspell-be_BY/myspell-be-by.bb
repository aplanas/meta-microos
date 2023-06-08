SUMMARY = "MySpell be_BY Dictionary"
DESCRIPTION = "Belarusian spelling dictionary and hyphenation: official orthography 2008."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-be_BY-20221012-1.2.noarch.rpm"
RPM_HASH = "54a8a06acba2e7a509ceea46df0219d7fc250cab27d5e1e1c18d7e0ae82cc6f36910280bb44f9c84614551973ca3d26b2dee65f960cf987f5ae9a576e83260e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:be_BY) locale(seamonkey-spellchecker:be_BY) myspell-be_BY myspell-belarusian myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
