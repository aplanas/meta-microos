SUMMARY = "Development libraries for OpenBLAS, serial version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_serial-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "2038ad75bd014db1eb8b2579b05e2ed14b245a9a18bc1a407a717826227754c6873b2e9036df65c3dc36e6918a27acb71a22c5737bc071e66f7c499a400f6a2d"

RPROVIDES:${PN} += "libopenblas_serial-devel \
libopenblas_serial-devel(aarch-64) \
openblas-devel(other)"
RDEPENDS:${PN} += "libopenblas_serial0 \
openblas-common-devel"

inherit rpm
