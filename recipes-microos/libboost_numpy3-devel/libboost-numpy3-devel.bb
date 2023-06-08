SUMMARY = "Development headers for Boost.Python.NumPy library"
DESCRIPTION = "Development headers for Boost.Python.NumPy library. This package contains \
library for python3 development for boost. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_numpy3-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "b556d4b0e353a0b7bc108a72cfc5da3173023ea39a3c10b92bf71682db24cb76485d9944e5313963816bda1ad5dfe5741d926f165bee06c51601f5ad8c40fd63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_numpy3-devel"
RDEPENDS:${PN} += "libboost_numpy-py3-1_82_0-devel"

inherit rpm
