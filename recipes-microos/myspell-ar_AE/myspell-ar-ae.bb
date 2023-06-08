SUMMARY = "MySpell ar_AE Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_AE-20221012-1.2.noarch.rpm"
RPM_HASH = "6db73c864af54d9ee6d5d38d5d3c73f6ac6c3866c050e330117587e815448cea429f0dba2e0aadc3dca1831fbbdc3bdab593576ae2099d9d69297531b3cf167c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_AE) locale(seamonkey-spellchecker:ar_AE) myspell-ar_AE myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar myspell-dictionaries"

inherit rpm
