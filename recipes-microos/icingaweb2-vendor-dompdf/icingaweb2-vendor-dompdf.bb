SUMMARY = "Icinga Web 2 vendor library dompdf"
DESCRIPTION = "Icinga Web 2 vendor library dompdf."
LICENSE = "LGPL-2.1-only"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-dompdf-2.11.4-1.1.noarch.rpm"
RPM_HASH = "10429847c19b33f84d84c4ee0044a0a5fc12c6aa08bd93f23187e152a7f93dac8cf4c358a06f5d2d3b97ac46ff706946d4ba34cbfc929f669799091bfb1d0c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-dompdf"
RDEPENDS:${PN} += "icingaweb2-common php"

inherit rpm
