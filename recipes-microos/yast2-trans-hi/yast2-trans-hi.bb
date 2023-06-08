SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-hi-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "7683db50039d23e1c4a1109de798c9c603522f307b6ee9991619cf3dbd27cfc4a80de2ecd6dcd89d087944af3331402da4358a951569d5e65060560e1c6fdf57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:hi) yast2-trans-hi"
RDEPENDS:${PN} += ""

inherit rpm
