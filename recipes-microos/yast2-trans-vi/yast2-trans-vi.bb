SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-vi-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "51e8f7f2a455a793137385d5c8543db4e9e4d2a213ef10e1f9ecaf5fe297098b2bc1c7f3f12a2fa8946649836010dd1f78dbe16b983741c7eeb5d1c56d73fff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:vi) yast2-trans-vi"
RDEPENDS:${PN} += ""

inherit rpm
