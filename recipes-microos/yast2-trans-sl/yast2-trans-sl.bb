SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sl-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "34e4bacacaacb507aecdf1362e29c4d03625e623fcc87c715215bef743164ecf863fe0898f2c582221b2288e55740d2cecbadf4e07f3d3a5e7f9edead729e2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sl) \
yast2-trans-sl"
RDEPENDS:${PN} += ""

inherit rpm
