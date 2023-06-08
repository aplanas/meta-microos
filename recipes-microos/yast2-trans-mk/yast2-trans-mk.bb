SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-mk-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "e02647466d4d1bd5063c89c667a115114bc2de90326d0261d246f965e383402b3af34caac10b783e00e4157f549730b0a279bac32924a38a709e831411ab8015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:mk) yast2-trans-mk"
RDEPENDS:${PN} += ""

inherit rpm
