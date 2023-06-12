SUMMARY = "Headers for libblastrampline, a BLAS/LAPACK demuxer"
DESCRIPTION = "libblastrampoline is a BLAS/LAPACK demuxer library that uses PLT \
trampolines and implements a consistent API atop BLAS implementations. \
 \
This package contains the headers for libblastrampoline."
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "libblastrampoline-devel-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "d5f964026412dae53b392d1bed1e476820448c2acbe47101aee68a99f9b8b505b5e9dcf1bec6fe5bbe640075aacfc4c0e5695482e69e479cc56f27e75cdb4eb6"

RPROVIDES:${PN} += "libblastrampoline-devel \
libblastrampoline-devel(aarch-64)"
RDEPENDS:${PN} += "libblastrampoline5"

inherit rpm
