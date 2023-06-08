SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-tg-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "8d1ce6a10b58a3c3bb7b5c07e4f0595950254ada6f8257af1ea47c3116c766a28cfcb7850348bcf4b7ddb781564412d37c546b2f871755690a381f0d9b11f6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:tg) yast2-trans-tg"
RDEPENDS:${PN} += ""

inherit rpm
