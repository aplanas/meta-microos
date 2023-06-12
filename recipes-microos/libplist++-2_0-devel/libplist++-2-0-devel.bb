SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Development Files"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the development files for C++."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libplist++-2_0-devel-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "dfc15d6d7ddb90b14bc6f58ff1525b75e76003f7518f00b4fd69f1982e838d19bae9a06e7fde074461f98975a0903471f5540b62eead5767eedb6508c1924cd6"

RPROVIDES:${PN} += "libplist++-2_0-devel \
libplist++-2_0-devel(aarch-64) \
libplist++-devel \
pkgconfig(libplist++-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplist++-2_0-3 \
pkgconfig(libplist-2.0)"

inherit rpm
