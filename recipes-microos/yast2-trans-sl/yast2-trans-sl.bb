SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sl-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "b1e310d6e65b21aee329cfb1355e9538bcdbd7c734f4861aba0525032d984aa6dae04c9db5d246e10ce42915f5c213a74868e65c1c88b85d68c15deabe873d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sl) yast2-trans-sl"
RDEPENDS:${PN} += ""

inherit rpm
