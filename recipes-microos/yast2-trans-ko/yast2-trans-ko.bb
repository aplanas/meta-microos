SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ko-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "2a20f4bdaeaf13c504e40e44fa3ab06e1acb7210a660d69915c345d70cc46ad5eeb1271778239f69f8348a1d54fa4bd3f181e5dc7d7dc793fa40a28a0c79e8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ko) yast2-trans-ko"
RDEPENDS:${PN} += ""

inherit rpm
