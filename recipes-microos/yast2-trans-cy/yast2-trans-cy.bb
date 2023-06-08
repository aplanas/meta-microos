SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-cy-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "baf72c9ed93c5be20a01a020f8a91feae0c18281057ed00143d0f60f7201ef8aa602c32778d9c45258e20144d693cb810f863707efb7eeed2076db603aa89fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:cy) yast2-trans-cy"
RDEPENDS:${PN} += ""

inherit rpm
