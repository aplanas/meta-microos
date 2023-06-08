SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy_1_24_2-gnu-hpc-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "c94a8e6d7b8b0f9da8a16b5c57de91e7db0494a29e73df5d6939bea6176a1339f84d3e266b8d39e42648dd4d8ad3f8dc6475d25314487af93bc75ae24ccd78fa"

RPROVIDES:${PN} += "python39-numpy_1_24_2-gnu-hpc-devel python39-numpy_1_24_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel python(abi) python39-devel python39-numpy_1_24_2-gnu-hpc"

inherit rpm
