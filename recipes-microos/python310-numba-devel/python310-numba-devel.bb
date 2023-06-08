SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.56.4"

RPM_NAME = "python310-numba-devel-0.56.4-2.1.aarch64.rpm"
RPM_HASH = "9fef672fd4302273537d87f86268a1d681d0b4b3da17e88015921041def2ac788b5fac435e08565220259365b161d1e7d9feec16ee353d47866c9b3491bc09bd"

RPROVIDES:${PN} += "python3-numba-devel python310-numba-devel python310-numba-devel(aarch-64)"
RDEPENDS:${PN} += "(python310-numpy-devel >= 1.18 with python310-numpy-devel < 1.25) python(abi) python310-devel python310-numba"

inherit rpm
