SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "e68355e2cacf8863b5aba9e2e41a692539ab54ff3c7ddbea548725d65f28a1edd6bb0c0a6d22cd17e1f80e2e1fc0b03798c277e69835d182da08f849bc46bcb3"

RPROVIDES:${PN} += "python3-numpy-devel python310-numpy-devel python310-numpy-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel cblas-devel lapack-devel python(abi) python310-devel python310-numpy"

inherit rpm
