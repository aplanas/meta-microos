SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-fr-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "c85a6f17a1577f7fed849cf2bb5ea99bbdda805155d9f2ed1f546b4e7c7c8459252e30047610aeb3db92904bd5694ee3706fde7284a3aeb4504346871fcd45ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:fr) yast2-trans-fr"
RDEPENDS:${PN} += ""

inherit rpm
