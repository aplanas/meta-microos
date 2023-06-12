SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-af-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "bddcf62cc9a8856df309a296d0232ecb9dcde271e67514d18ce02e4dae1f43b9ec5611331ac8ada7c63add6f3e6d76a81f3c4eb48c32f0a27a9c757a62118c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:af) yast2-trans-af"
RDEPENDS:${PN} += ""

inherit rpm
