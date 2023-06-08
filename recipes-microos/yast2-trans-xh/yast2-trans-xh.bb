SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-xh-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "5af97dc74b65f5fcdca4b3be4d0958f2fadebd253cdec549c973f344295f3d6b9857cfba77d7362032d4dd7eaf131117ccfcf4d7d57c856c5131ec245e9b4afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:xh) yast2-trans-xh"
RDEPENDS:${PN} += ""

inherit rpm
