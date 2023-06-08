SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-mr-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "451835608829918be7fb5e88a3e43f1aa617d6fb7057732cf8f7067bcfbd38c9546a53c8e2e8561b8aa703da1c68230a8c38be593d9c8eab2768be5fd898bf53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:mr) yast2-trans-mr"
RDEPENDS:${PN} += ""

inherit rpm
