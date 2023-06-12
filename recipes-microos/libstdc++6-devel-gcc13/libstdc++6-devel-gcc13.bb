SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-devel-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "71bdb13e38699c763d4495bd29b3f70252f3f782f350d36a1f1bcf5fc93b685d8a55aad4dc67765add8524bef45a1c8ebc76cfdc8b82a8964d75f64c45538450"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13 libstdc++6-devel-gcc13(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libstdc++6"

inherit rpm
