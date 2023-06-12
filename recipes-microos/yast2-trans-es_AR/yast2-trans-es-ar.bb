SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-es_AR-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "0f350e0538e25938e5e6eb81ac7dacbac4c110626f24e0a3619c68046029533135ededa0d7b98f4da3df26172dea41549422bb7162f8283e5908df6ab8152d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:es_AR) yast2-trans-es_AR"
RDEPENDS:${PN} += ""

inherit rpm
