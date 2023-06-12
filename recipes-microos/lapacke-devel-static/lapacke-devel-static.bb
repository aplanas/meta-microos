SUMMARY = "LAPACKE static libraries"
DESCRIPTION = "LAPACKE development files - static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "lapacke-devel-static-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "2c8bf512c9ffd0fa86ab2cb02b9747eaa7d34bd976e12b12c63d1de3d36a12bb7da551cee83ac061de06a1617eb2f5ba80d8fe01101befd90fea35c6bdf61152"

RPROVIDES:${PN} += "lapacke-devel-static \
lapacke-devel-static(aarch-64)"
RDEPENDS:${PN} += "lapacke-devel"

inherit rpm
