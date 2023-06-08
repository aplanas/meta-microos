SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-es-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "4d8388833bcf85b373ebf78ac118063ac57974ea81a34a60534a689a8d0487e17568d17c4eb924233db440f6f6cc3886d3b8d36923b484958a470ecc4aeeebab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:es) yast2-trans-es"
RDEPENDS:${PN} += ""

inherit rpm
