SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-bg-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "09fee968a5dfb346af03f166692209173da3f2e5b316f296fb821f821d044f2fba102a63dc4d5edf7a349649d57d96fa77307ed84d5a7fb729d5f06e3d3e47ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:bg) yast2-trans-bg"
RDEPENDS:${PN} += ""

inherit rpm
