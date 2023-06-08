SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "9e359cfcb4cb195b6122acc2863dde3a8da7238307365fd18fd7800080b01eba9b57fb82825f1be46d4eeaf0f0191706a8c86ff116924091c534dd9ac419b372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:zh_TW) yast2-trans-zh_TW"
RDEPENDS:${PN} += ""

inherit rpm
