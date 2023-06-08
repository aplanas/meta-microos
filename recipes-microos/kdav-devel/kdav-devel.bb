SUMMARY = "Development package for kdav"
DESCRIPTION = "This package contains development files needed to use kdav in other applications."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kdav-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "fad54d4926aeabb289d3e12cd7de6280e3f2ef8ad6bea57d2c06b12010dce39173fcfdbd4fa800e4edd8c31c1632c7b71404f2640261745e89e59d21255d2974"

RPROVIDES:${PN} += "cmake(KF5DAV) kdav-devel kdav-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5DAV5"

inherit rpm
