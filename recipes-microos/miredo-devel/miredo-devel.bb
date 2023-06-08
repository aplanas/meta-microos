SUMMARY = "Header files, libraries and development documentation for miredo"
DESCRIPTION = "This package contains the header files, development libraries and development \
documentation for miredo. If you would like to develop programs using miredo, \
you will need to install miredo-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-devel-1.2.6-5.7.aarch64.rpm"
RPM_HASH = "2ffa2d72993ea5fe8a1e30076ca21e0292f5deb190a2f09fba3c79a6b3f7499f09ac7074f6e6cd265fcd47256bf4e90b876feac77124e266e4045efa6fcceeb0"

RPROVIDES:${PN} += "miredo-devel miredo-devel(aarch-64)"
RDEPENDS:${PN} += "miredo-common"

inherit rpm
