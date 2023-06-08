SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.56.4"

RPM_NAME = "python39-numba-devel-0.56.4-2.1.aarch64.rpm"
RPM_HASH = "09df24f71d47ded951ae8d3382e2170c6d29d3fa639f577fdbda420c04af07e984867d9296cee30b26eccf2e9b9bc8ba7677bce620e17a760b8f15786fa88011"

RPROVIDES:${PN} += "python39-numba-devel python39-numba-devel(aarch-64)"
RDEPENDS:${PN} += "(python39-numpy-devel >= 1.18 with python39-numpy-devel < 1.25) python(abi) python39-devel python39-numba"

inherit rpm
