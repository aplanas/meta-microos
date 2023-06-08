SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy_1_24_2-gnu-hpc-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "a0af63c50d54e22d92c707e5d8f449c95f8fcead5ac69eb075a33b60d43faf359c7ca2e5624e69b3bff3657550c8a95187eab197699d36ace21b8526261add7b"

RPROVIDES:${PN} += "python3-numpy_1_24_2-gnu-hpc-devel python310-numpy_1_24_2-gnu-hpc-devel python310-numpy_1_24_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel python(abi) python310-devel python310-numpy_1_24_2-gnu-hpc"

inherit rpm
