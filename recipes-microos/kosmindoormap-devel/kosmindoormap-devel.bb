SUMMARY = "Development package for kosmindoormap"
DESCRIPTION = "This package contains development files for the KOSM and KOSMIndoorMap libraries."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.0"

RPM_NAME = "kosmindoormap-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7e835246e09d795561abece5f6f921022abc235e84a8205403157946611d09c84a7fc434c6cf29f797ddc6b256728ece2691868c175cfa6aa2ab516a63503810"

RPROVIDES:${PN} += "cmake(KOSMIndoorMap) kosmindoormap-devel kosmindoormap-devel(aarch-64)"
RDEPENDS:${PN} += "libKOSM1 libKOSMIndoorMap1"

inherit rpm
