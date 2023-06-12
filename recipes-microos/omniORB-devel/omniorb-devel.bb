SUMMARY = "Development libraries, header files and utilities for omniORB"
DESCRIPTION = "omniORB-devel contains the omniORB development files. These \
files are needed to develop applications based on omniORB."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORB-devel-4.3.0-2.6.aarch64.rpm"
RPM_HASH = "be550a87a4fc8be1d596f76515a513ba896c4a3d115b76ba54392dc786c6f4b14e8fe390512126c2b2b1667c70d790998acd5b7b9353591bcb502d253e978959"

RPROVIDES:${PN} += "omniORB-devel \
omniORB-devel(aarch-64) \
pkgconfig(omniCOS4) \
pkgconfig(omniCOSDynamic4) \
pkgconfig(omniConnectionMgmt4) \
pkgconfig(omniDynamic4) \
pkgconfig(omniORB4) \
pkgconfig(omniZIOP4) \
pkgconfig(omniZIOPDynamic4) \
pkgconfig(omnithread3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomniORB4-3 \
libomnithread4 \
omniORB \
pkgconfig(omniCOS4) \
pkgconfig(omniORB4) \
pkgconfig(omniZIOP4) \
pkgconfig(omnithread3)"

inherit rpm
