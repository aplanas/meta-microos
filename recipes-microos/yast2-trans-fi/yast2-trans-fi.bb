SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-fi-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "3368456aa13672c331f142d1a2f98c8b3ffa83b9bd6bf1f0a5bd98bf045fe0d0c46baaa5a1348113186cdae7c70804343e3a1d5c4bc36af9345a59df3e0c855a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:fi) \
yast2-trans-fi"
RDEPENDS:${PN} += ""

inherit rpm
