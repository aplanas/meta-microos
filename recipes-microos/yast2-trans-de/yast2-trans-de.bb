SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-de-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "38e1e6dc4b5513cae0e4fc85a0128b4adf37654f278ac1fd391afa9166e1335dc640ae8eff36e8474da5c9d2ae671f767681d770a84e1219c8d004c034b9a41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:de) yast2-trans-de"
RDEPENDS:${PN} += ""

inherit rpm
