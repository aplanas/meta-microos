SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sq-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "cfc899c022760c34279c7f37a6e1ef94eee7be0a4fab7cbd7e3265f8c555c1834fce8dc436b29bccbe72a601fd8e1fbc18b23fe4635fa989371bd1fc3b51fedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sq) yast2-trans-sq"
RDEPENDS:${PN} += ""

inherit rpm
