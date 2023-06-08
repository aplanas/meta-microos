SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-kn-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "2ea6ac3e60fc4c0040b4c49e09afae5d3aa87721b739c85ce76388bd4479c3cd67f95f8583e2093bfd0711e5110c21e98e7a51ab3cb6d3e16fee6dcb1df10c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ka) yast2-trans-kn"
RDEPENDS:${PN} += ""

inherit rpm
