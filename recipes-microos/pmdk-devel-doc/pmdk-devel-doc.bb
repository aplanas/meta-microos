SUMMARY = "Man pages for the libpmem C API"
DESCRIPTION = "Documentation for the pmem library interface."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "pmdk-devel-doc-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "d23d8d3040ed53f9ac3085cc3c7fdc1e5f2501e973301f6bb3037f5bf6d273f91053174e43dc90abe6f3f00c320348dc52cdbc987c29ded662780b6ea240919f"

RPROVIDES:${PN} += "pmdk-devel-doc \
pmdk-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
