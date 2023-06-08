SUMMARY = "MySpell sq_AL Dictionary"
DESCRIPTION = "Albanian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sq_AL-20221012-1.2.noarch.rpm"
RPM_HASH = "e908bfb3cab1703f99887c81a87d97e6b6c27071ed3ba899bf7494521a17160b478e6dc2197d38508fdd5edd6c95b38d7d0cfba99fc288fb4111eb8cf6a2797c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:sq_AL) locale(seamonkey-spellchecker:sq_AL) myspell-dictionary myspell-sq_AL"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
