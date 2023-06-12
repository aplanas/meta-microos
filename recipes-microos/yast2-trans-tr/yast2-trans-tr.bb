SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-tr-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "ca2c7e7372e01ff9fabbcb68735f7bafa6470971f917f87282e682d5526a56e950b6ee25928006f01050b89868d9be0970d6606073d8ed46bbaa9befbcc8dc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:tr) yast2-trans-tr"
RDEPENDS:${PN} += ""

inherit rpm
