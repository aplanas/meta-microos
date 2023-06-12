SUMMARY = "Development files for libfsrefs"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsrefs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-devel-20210422-3.3.aarch64.rpm"
RPM_HASH = "ecc29326bf665d0462a2271a1046d801308f90112940a80524e3abbb6dd6d69c16f6892869087bf606986c70ca7122ff0f5a00f8906d7d558ae3bcaa0cc3892a"

RPROVIDES:${PN} += "libfsrefs-devel \
libfsrefs-devel(aarch-64) \
pkgconfig(libfsrefs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsrefs1"

inherit rpm
