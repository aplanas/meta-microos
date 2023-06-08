SUMMARY = "Development headers for Boost.Python library"
DESCRIPTION = "Development headers for Boost.Python library. This package contains \
library for python3 development for boost. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_python3-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "65465f59271eb99a1e346f35db924f3549794c97b9b020f8f5bf3605af8092187ec597fc698ec3ad8f4b43494d034168ab82fd99bd7aee4e3e68c18f7f9bb194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_python3-devel"
RDEPENDS:${PN} += "libboost_python-py3-1_82_0-devel"

inherit rpm
