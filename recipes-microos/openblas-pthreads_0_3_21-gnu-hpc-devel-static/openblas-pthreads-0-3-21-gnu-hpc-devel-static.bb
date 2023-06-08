SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas-pthreads_0_3_21-gnu-hpc-devel-static-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "e7115dc3426baeed71ffe64aa1cab41645ec4dfc4fef390329a71116da1a3c9f74a36f52bb0643db962500a0f5be9a9ffbe313cd5978f5618af22602d3b7509c"

RPROVIDES:${PN} += "openblas-pthreads_0_3_21-gnu-hpc-devel-static openblas-pthreads_0_3_21-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "libopenblas-pthreads_0_3_21-gnu-hpc-devel"

inherit rpm
