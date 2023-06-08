SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ar-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "94ec024be418b1f9757fecccf51a27bbf1b5623560ed8b13603fd96c9157a757e12318b9d25e2f41ae78ebea3414c52d6dacee14c0acdf23d0a2d0799ba273d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ar) yast2-trans-ar"
RDEPENDS:${PN} += ""

inherit rpm
