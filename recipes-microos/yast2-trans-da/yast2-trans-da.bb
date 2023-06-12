SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-da-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "21d32c14690294a404aed3d5b15012612afaa8df0df910585639f414a15673fde9bd95228a2af6a29fc64b81519c6efce28a53fee52dd4c3582d0b8dabf2fe97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:da) yast2-trans-da"
RDEPENDS:${PN} += ""

inherit rpm
