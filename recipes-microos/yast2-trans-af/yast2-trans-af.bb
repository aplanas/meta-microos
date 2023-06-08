SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-af-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "60365e505fdd4c225ed1297482b6233f02efeb29627fbdc11fffd96489082cd20f554502d086ed25ac7494f56a694de3e55b50420ffeadbf0a00ed55f9c0f4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:af) yast2-trans-af"
RDEPENDS:${PN} += ""

inherit rpm
