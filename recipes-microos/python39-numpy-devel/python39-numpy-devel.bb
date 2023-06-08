SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "0b2f8dcc2bed03fe70bed4578983681789f28970cc8dedd473056b8320c78a1a97013f1d7a27890e7a3b59769b4bb7bc6ca22aaacef40e323489e415a183283a"

RPROVIDES:${PN} += "python39-numpy-devel python39-numpy-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel cblas-devel lapack-devel python(abi) python39-devel python39-numpy"

inherit rpm
