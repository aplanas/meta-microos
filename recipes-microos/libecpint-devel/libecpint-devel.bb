SUMMARY = "Devel package for libecpint"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic. \
This package contains development headers and libraries for libecpint"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libecpint-devel-1.0.7-2.10.aarch64.rpm"
RPM_HASH = "572a4ba5f058f7ad8d15033a896b51705e34014cf505e9fd7ff59a68d0455cac9d630176e6af909ceff5f260952930306d727c16a15d84bee8012957d54cc146"

RPROVIDES:${PN} += "cmake(ecpint) libecpint-devel libecpint-devel(aarch-64)"
RDEPENDS:${PN} += "libcerf-devel libecpint1"

inherit rpm
