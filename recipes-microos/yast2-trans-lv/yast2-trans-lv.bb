SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-lv-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "5d96afb1daf2f899b9c66002da36a1937b551d56862dd88c9c185de102f64f8669fbee9aeb747f1854db807fc51ef27542621292f5e55caa1caadb2c4166d534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:lv) yast2-trans-lv"
RDEPENDS:${PN} += ""

inherit rpm
