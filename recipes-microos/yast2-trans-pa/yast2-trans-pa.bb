SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-pa-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "24cacc7a269289886d784d53467187a60532600bf6c871b1716d9b1260947dfffac7814da14337e6b48f7d7ad99e338d3ad3e531b20a8b3b77b2eeea452de6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pa) yast2-trans-pa"
RDEPENDS:${PN} += ""

inherit rpm
