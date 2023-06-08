SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "8102f22829ec8b94139f6c0a772be27179b833675004fc8e9d0bf34ff8a76542136125fcb5781d5b0a0e2a9e339209570758773e8d9fd22b8f6eb137ae70929d"

RPROVIDES:${PN} += "python3-numpy-devel python310-numpy-devel python310-numpy-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel cblas-devel lapack-devel python(abi) python310-devel python310-numpy"

inherit rpm
