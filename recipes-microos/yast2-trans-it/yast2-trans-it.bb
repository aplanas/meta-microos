SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-it-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "122db3cd14f82cb7cd186f2d2c39b4688e8383fda014c6e901b0b59838dfe9686ec55886efc8ec21e1b4d37f657b5db03ae730666ba8d5757aa5d940370e873c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:it) yast2-trans-it"
RDEPENDS:${PN} += ""

inherit rpm
