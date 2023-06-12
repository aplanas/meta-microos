SUMMARY = "Development headers for Boost.Python library"
DESCRIPTION = "Development headers for Boost.Python library. This package contains \
library for python3 development for boost."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_python-py3-1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "377de8a5e969928340cebfc11bd3a0917c1cd1a3dbcb3bb01456ad8e08e0710f2f3cc1f9b94b9714f17ace533ce23091fbd5bb6aba02717fcc2fe99a3cd9e868"

RPROVIDES:${PN} += "libboost_python-py3-1_82_0-devel \
libboost_python-py3-1_82_0-devel(aarch-64) \
libboost_python3-devel-impl"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel \
libboost_python-py3-1_82_0"

inherit rpm
