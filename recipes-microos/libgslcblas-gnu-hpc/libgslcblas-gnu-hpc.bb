SUMMARY = "Dependency package for libgslcblas_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package libgslcblas-gnu-hpc provides the dependency to get binary package libgslcblas_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas-gnu-hpc-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "a402d3b917a2d2a5e1e60252eeede8f14a629883f23ecf3bf502f97b58271b3d34be20b2070e04febf907ddd804e846a224b45e4d0da77029ded7150f02a70b6"

RPROVIDES:${PN} += "libgslcblas-gnu-hpc \
libgslcblas-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libgslcblas_2_7_1-gnu-hpc"

inherit rpm
