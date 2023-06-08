SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sw-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "09ad1aaa14ee93e71bf17f5feaa10a1227f61717dc8fafefd6aba667f6112ce0ae1604798da14b184e13f6e716c146c5a8cc44465c1ed0d4e30f8373462db522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sw) yast2-trans-sw"
RDEPENDS:${PN} += ""

inherit rpm
