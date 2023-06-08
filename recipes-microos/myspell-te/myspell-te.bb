SUMMARY = "MySpell te Dictionary"
DESCRIPTION = "Telugu spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-te-20221012-1.2.noarch.rpm"
RPM_HASH = "c81d37b06e1099fd9f6b55b8a78a796f22d79824dfca20a0903f193a9383b6166e880ecae5632eec19209c5775e4fcec1dd8e7a47136267409ed7b236da73153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:te) locale(seamonkey-spellchecker:te) myspell-dictionary myspell-te"
RDEPENDS:${PN} += "myspell-dictionaries myspell-te_IN"

inherit rpm
