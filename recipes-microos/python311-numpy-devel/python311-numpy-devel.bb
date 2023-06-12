SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "e4f67c1a73b3264db186cb26299c9fe0a0ee6197913c8b4f8ceef5a1042de4274a51d86704b51e557e059ebedb193904db4d429638d6343d739992b97500d246"

RPROVIDES:${PN} += "python311-numpy-devel python311-numpy-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel cblas-devel lapack-devel python(abi) python311-devel python311-numpy"

inherit rpm
