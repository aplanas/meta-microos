SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-nb-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "098aac064f8e8f113a2c06caf17e659f689453aacb79274f29c9dd8fab115c1b08299cc042ca562c9b70167bcf815eea7976b0cfb84f2daa07cfac77f5e69cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nb) yast2-trans-nb"
RDEPENDS:${PN} += ""

inherit rpm
