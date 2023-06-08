SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ps-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "d462454339c25e676855f301df52f2476a5f0fc5b936eb1928f85c09a866f8d1d8d2541e3541d273d59d027dae753ace8c0de736621acafb482cccda52e127f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ps) yast2-trans-ps"
RDEPENDS:${PN} += ""

inherit rpm
