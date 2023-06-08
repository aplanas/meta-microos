SUMMARY = "Development files for the base X bitmaps"
DESCRIPTION = "This package contains the base X bitmaps, which are used in many \
legacy X clients."
LICENSE = "X11"

PV = "1.1.3"

RPM_NAME = "xbitmaps-devel-1.1.3-2.1.noarch.rpm"
RPM_HASH = "80d0273f6e996f3f2ba61e8be8e2a65679c0887f109579459e6bc069d0f1c07628e662698a527b0ca9e841c820aad5931df71c93280f33bd35ce3f9400a0f1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(xbitmaps) xbitmaps-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
