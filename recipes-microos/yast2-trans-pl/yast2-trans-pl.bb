SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-pl-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "b5394970a90a55fec2fc9fff0eaabb36176c109ecfe2ff9cb845a80533675fa5ce77760f6ccc31dbaeb39e9ebd93b8d850da8aaf2213606e9a976c1ca276c231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pl) yast2-trans-pl"
RDEPENDS:${PN} += ""

inherit rpm
