SUMMARY = "MySpell bo Dictionary"
DESCRIPTION = "Classical Tibetan syllable spellchecker for Hunspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bo-20221012-1.2.noarch.rpm"
RPM_HASH = "cc52030675f237e716761c2503238c6c29ee795f479fc763456dde152cfa4acb91e05482a562378b126ffe7268bcc53bf70d085ec7a9b30135cb615588b44888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:bo) locale(seamonkey-spellchecker:bo) myspell-bo myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
