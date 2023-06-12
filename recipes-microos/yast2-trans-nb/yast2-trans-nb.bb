SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-nb-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "a84a84970c5828a33048e09c8ae86f43665fded8d6a5b6d9c880599edd9cc7e31c6fb3617638976d6c54705a0cbdda60326833211a918d20aad72a4be63631b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nb) yast2-trans-nb"
RDEPENDS:${PN} += ""

inherit rpm
