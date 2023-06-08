SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-pt-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "59a8842b9356e647ee8d8dd0be3e3d3511aecdca1bf37ab83821bfc02193b15ce358344edda07c19df9b13c125b82bd5d6ca83ea4fc10b5f46f83ecacf0783c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pt) yast2-trans-pt"
RDEPENDS:${PN} += ""

inherit rpm
