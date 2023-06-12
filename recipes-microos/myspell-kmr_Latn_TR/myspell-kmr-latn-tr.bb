SUMMARY = "MySpell kmr_Latn_TR Dictionary"
DESCRIPTION = "Kurdish (Turkey) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-kmr_Latn_TR-20221012-1.2.noarch.rpm"
RPM_HASH = "cc3488b7be61a0c3df14921e13f15629c89da13c614262d529576accf7efad80f1d039114a50d5fabb194b7777da1afecf4583f4dc1276477acf63f809b7c366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:kmr_Latn_TR) \
locale(seamonkey-spellchecker:kmr_Latn_TR) \
myspell-dictionary \
myspell-kmr_Latn_TR"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-kmr_Latn"

inherit rpm
