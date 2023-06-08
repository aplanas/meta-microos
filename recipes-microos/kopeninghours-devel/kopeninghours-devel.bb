SUMMARY = "Development files for KOpeningHours"
DESCRIPTION = "Include files and libraries needed to build programs that use the KOpeningHours \
library."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kopeninghours-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0e7bfcd291ef4d3d1fcc6f12bc7f1bc9d6c0ece5fffd8bf240fa5821c1411e3d95031e150c2e7f971377b79bc305f5b5e4bddfc5a9df9b420276af5ff55ef424"

RPROVIDES:${PN} += "cmake(KOpeningHours) kopeninghours-devel kopeninghours-devel(aarch-64)"
RDEPENDS:${PN} += "libKOpeningHours1"

inherit rpm
