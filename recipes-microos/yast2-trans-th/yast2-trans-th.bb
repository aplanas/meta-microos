SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-th-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "d12878943498c362e90048db2068ad7317dea685bc77446fb90c34bcc8f027c101c71770a65bfe52bd67e6312c4fa0ea3e65ce2b7f57fce95a1449e574735f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:th) yast2-trans-th"
RDEPENDS:${PN} += ""

inherit rpm
