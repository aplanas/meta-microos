SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "2b95942af345d34887d63533a3578ce74e9b9df7fbbbaac87316af6ede808d09549ac05b358a5546a3c770eff3dd8521034a0caef6398507768e37faf13f1e69"

RPROVIDES:${PN} += "python311-numpy-devel python311-numpy-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel cblas-devel lapack-devel python(abi) python311-devel python311-numpy"

inherit rpm
