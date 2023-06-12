SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-si-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "102b70d554e008e7f38a1076b62a471fd8efe6a140c34d8119926ebc0264efe7fb396c89e9b11b6f1b305773394e640c3d3daa11b4eb4792232720f6a22011a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:si) \
yast2-trans-si"
RDEPENDS:${PN} += ""

inherit rpm
