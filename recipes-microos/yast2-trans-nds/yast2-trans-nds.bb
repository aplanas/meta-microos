SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-nds-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "8c51eeaf62664f93c3ac2cdd4e2bb65f7f4ed49c66228fc208a08b77f88e8fbcf416878ac008e1461af0b8d0e9b0e2fc2507a15472ef173567ff36900c0858f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nds) \
yast2-trans-nds"
RDEPENDS:${PN} += ""

inherit rpm
