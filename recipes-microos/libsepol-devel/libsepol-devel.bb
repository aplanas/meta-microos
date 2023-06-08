SUMMARY = "Development files for SELinux's binary policy manipulation library"
DESCRIPTION = "The libsepol-devel package contains the libraries and header files \
needed for developing applications that manipulate binary SELinux \
policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol-devel-3.5-1.3.aarch64.rpm"
RPM_HASH = "499ecbbd0ea731e9f02c7bae1a3a26adfd1e88557971761b212f758860e953007b3816ccfe7f52b78de6b8c9677638b55c41e2c02ff246d14dd7afff1b8e2bc5"

RPROVIDES:${PN} += "libsepol-devel libsepol-devel(aarch-64) pkgconfig(libsepol)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libsepol2"

inherit rpm
