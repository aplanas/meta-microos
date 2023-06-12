SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-et-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "8e792ee44f61f5786e08cec63efc1d7fd02ae06984f6c12b1ff22e609f3e2da698190499084eaebf4877e0f9b33116e9ac4cd9da05dbb0b24137d701d44a1d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:et) yast2-trans-et"
RDEPENDS:${PN} += ""

inherit rpm
