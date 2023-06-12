SUMMARY = "MySpell ar_JO Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_JO-20221012-1.2.noarch.rpm"
RPM_HASH = "38662f649a48456adb5ecfc5b998a80d83c0a20c08cf12a69a3edbb1d41e19490468667c654cf6b69a761570ac08a189150fdc3a228e55ee38d2d12c19494d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_JO) \
locale(seamonkey-spellchecker:ar_JO) \
myspell-ar_JO \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
