SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy_1_24_2-gnu-hpc-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "e63240344055e0a91790f191d43350eba12e3d42065f9d432f198171b8531c24e7b11990964b564d7837f8fba15774a29d156dccc7ea37a926bffb47e1ffa35e"

RPROVIDES:${PN} += "python311-numpy_1_24_2-gnu-hpc-devel python311-numpy_1_24_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel python(abi) python311-devel python311-numpy_1_24_2-gnu-hpc"

inherit rpm
