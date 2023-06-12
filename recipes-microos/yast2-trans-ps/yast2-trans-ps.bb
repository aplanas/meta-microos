SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ps-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "7cebfae8dee4bed64a3f506b359356d5f47093e0e172e3e3b1b9d35278687ebfbb6e047163e860139d7177faa49d7304fbcbdee5506ca102bf8e583695779179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ps) \
yast2-trans-ps"
RDEPENDS:${PN} += ""

inherit rpm
