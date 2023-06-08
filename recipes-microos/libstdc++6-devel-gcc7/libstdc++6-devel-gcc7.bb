SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-devel-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "6dc9466bbecc12b0598bbd81d3d44130c73c1093079fda26ed125a03178d4a52b26d191a53b391cca8b589fc8b20977a56e5c3030e9575318d84a12b5c82a6ac"

RPROVIDES:${PN} += "libstdc++6-devel-gcc7 libstdc++6-devel-gcc7(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libstdc++6"

inherit rpm
