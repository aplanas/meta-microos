SUMMARY = "Development files for LinBox, a library for computation over finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields. \
 \
This subpackage contains the include files and library links for \
developing against the Givaro library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.0"

RPM_NAME = "linbox-devel-1.7.0-1.7.aarch64.rpm"
RPM_HASH = "602748c734291027f583eb3b47b8ab896c53853fffc9f9877ff1b72a76cd1d8ed825a8c238b59596b03620f3a4e07eee9146d21fc8a28d50f0c1dc3ee9df1cc9"

RPROVIDES:${PN} += "linbox-devel linbox-devel(aarch-64) pkgconfig(linbox)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/pkg-config liblinbox0 pkgconfig(fflas-ffpack)"

inherit rpm
