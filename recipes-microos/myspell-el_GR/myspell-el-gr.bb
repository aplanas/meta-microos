SUMMARY = "MySpell el_GR Dictionary"
DESCRIPTION = "Greek spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-el_GR-20221012-1.2.noarch.rpm"
RPM_HASH = "a8596f6ad4c659f60c2a1277b8c718e05047639b7937aaca57a93fe9cc22c6256433f9cd5a59ffc0b4839fa6bac07f8f5fa1c9cad665dd2c18fc5b44eb23326a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-el locale(libreoffice:el_GR) locale(seamonkey-spellchecker:el_GR) myspell-dictionary myspell-el_GR myspell-greek"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
