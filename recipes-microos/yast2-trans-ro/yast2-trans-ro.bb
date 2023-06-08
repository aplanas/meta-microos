SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ro-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "8377450b1ea087c4faf405392631e7a25169a1e60fc079a6019cbdc271292cbe3763061ca47103770aa5dffb61953934ee3b78acfcdc4fb345e3df5a155837fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ro) yast2-trans-ro"
RDEPENDS:${PN} += ""

inherit rpm
