SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-kab-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "9dffca23a35fb2b03cb82518a010ac8ba2cca0cc3201a89bb87521f35dfc84ed2ab9a320c898077d3c394d070c20036e4eb286c32f5b79c80db5e44b8d2dd3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:kab) yast2-trans-kab"
RDEPENDS:${PN} += ""

inherit rpm
