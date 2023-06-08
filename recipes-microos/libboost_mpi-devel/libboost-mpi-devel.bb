SUMMARY = "Development headers for Boost.MPI library"
DESCRIPTION = "Development headers for Boost.MPI boost library \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_mpi-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "6262a749349a71882fc9de3eaaaba30d614f05fc0b153739b462fb6719d2c9cacd45f7c9dff31a767530472eee2e3df5b9133453d336a075f6ba15efb3679f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_mpi-devel"
RDEPENDS:${PN} += "libboost_mpi1_82_0-devel"

inherit rpm
