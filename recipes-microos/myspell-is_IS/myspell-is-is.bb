SUMMARY = "MySpell is_IS Dictionary"
DESCRIPTION = "Icelandic spelling dictionary, hyphenation rules and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-is_IS-20221012-1.2.noarch.rpm"
RPM_HASH = "4622c497b30886f3bd89f36978830e392ecc2dbc96af5f8a1f03fd1ba79c4e828856e6ece7a19b86314bad61f90f0921f1d681cfb7895e6248ad76ec5b528486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:is_IS) locale(seamonkey-spellchecker:is_IS) myspell-dictionary myspell-is_IS"
RDEPENDS:${PN} += "myspell-dictionaries myspell-is"

inherit rpm
