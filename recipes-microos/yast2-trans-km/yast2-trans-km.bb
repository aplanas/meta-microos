SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-km-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "315301fcdf89b37774ed2727d2d06c6a2a7ec67739a350271a620000b346830dc1cb7f41d4e4a0900b96af303719774a75c16bdb6d7bdca213b6b7d5b0292106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:km) yast2-trans-km"
RDEPENDS:${PN} += ""

inherit rpm
