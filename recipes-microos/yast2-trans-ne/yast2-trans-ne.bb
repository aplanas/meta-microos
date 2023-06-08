SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ne-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "6aa5f93e58f026d900570f8fbedd445e156078aa5cccd7ac16ac37ec56040bbadda158192688aa31d179a020dd1ca50abdade691405c42b3e0c31079322cc589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ne) yast2-trans-ne"
RDEPENDS:${PN} += ""

inherit rpm
