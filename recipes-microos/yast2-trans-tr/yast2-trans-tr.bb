SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-tr-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "4772bfbff1ee499694b90fce53fce614cf6785655184c9583bd1bb4d3c6d4ec256d7026e3e7e2a5fc6aef0e9f4fb6b60b9a266cdcec86ebc8b93d4bab9de742c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:tr) yast2-trans-tr"
RDEPENDS:${PN} += ""

inherit rpm
