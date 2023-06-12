SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-vi-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "5c30e28d3a085c918b95c88fdb927f0a83db67afc4805b103935cf40ef6af749dc85e1fa5052b8c3af0080e4e7277d3d91f0c907c8712c2d49ed5995c6a867be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:vi) yast2-trans-vi"
RDEPENDS:${PN} += ""

inherit rpm
