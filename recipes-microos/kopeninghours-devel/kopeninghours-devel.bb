SUMMARY = "Development files for KOpeningHours"
DESCRIPTION = "Include files and libraries needed to build programs that use the KOpeningHours \
library."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kopeninghours-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "34a57e16ba2301391c2cac102d8cb4fcf171244c53e9d87597b4cbb6109e42e0c286e4f7a6471a427250c97752fc8373709f9a37c7a6c4b9d461d47dc9b654da"

RPROVIDES:${PN} += "cmake(KOpeningHours) kopeninghours-devel kopeninghours-devel(aarch-64)"
RDEPENDS:${PN} += "libKOpeningHours1"

inherit rpm
