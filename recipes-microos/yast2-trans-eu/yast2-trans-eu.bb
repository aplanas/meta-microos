SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-eu-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "18aa1eb9953c6586e5206e908fd87356a109eeeb82b36f36a770e6e30355b98b7146d3a9f54218d264b34800ae53365f7066fcad32a95d1313d8b9b4bebd1c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:eu) yast2-trans-eu"
RDEPENDS:${PN} += ""

inherit rpm
