SUMMARY = "MySpell ca_FR Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ca_FR-20221012-1.2.noarch.rpm"
RPM_HASH = "e5879a849428417fef6583fa9a0167c95b7579f12311be3031fa6666e3e31f7d47b8a9c913439c107769f2b97db483072ad101fa890499b816517c63dd26f6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ca_FR) locale(seamonkey-spellchecker:ca_FR) myspell-ca_FR myspell-dictionary"
RDEPENDS:${PN} += "myspell-ca myspell-dictionaries"

inherit rpm
