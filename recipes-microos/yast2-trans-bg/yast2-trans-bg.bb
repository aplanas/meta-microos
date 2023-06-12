SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-bg-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "740f72c506cf3e6d61edc45075088f9a7b62619825a385da4585d721903bb84c967ece756e22842b5dede4257134e4ad7e50e47c93795d986d68fdbfa0a84e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:bg) \
yast2-trans-bg"
RDEPENDS:${PN} += ""

inherit rpm
