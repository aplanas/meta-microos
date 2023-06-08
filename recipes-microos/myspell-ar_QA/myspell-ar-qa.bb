SUMMARY = "MySpell ar_QA Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_QA-20221012-1.2.noarch.rpm"
RPM_HASH = "ac04edbcc2952c32c2f78eecf8567484560a22cb988b97a044905cc5433fdd9fa9f01ea66705ee00a49399abfb8f64f803db92805c7ed04eba91bdc615fe0533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_QA) locale(seamonkey-spellchecker:ar_QA) myspell-ar_QA myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar myspell-dictionaries"

inherit rpm
