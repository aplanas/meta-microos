SUMMARY = "Development headers for Boost.Random library"
DESCRIPTION = "This package contains Boost.Random development headers. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_random-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "40efa89e096a95bf24f0fad33a7f85dfff20b716a88a5e516599199e10572f33131956b4299af226b7f55e5b0fb41bfc694b0775b5fc20706319180fe5166c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_random-devel"
RDEPENDS:${PN} += "libboost_random1_82_0-devel"

inherit rpm
