SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-en_GB-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "dba35b3395a9b4837b3ab16c1babcba4c748d1fa750f7786e54f9ee8cdeca3b0e034c4c0c11fc4d73ea1d32395de0b7e2c7e173e9a1cff80c4f566fddee5f33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:en_GB) yast2-trans-en_GB"
RDEPENDS:${PN} += ""

inherit rpm
