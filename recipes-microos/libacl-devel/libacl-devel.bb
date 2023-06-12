SUMMARY = "Header files for the POSIX ACL library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libacl."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "libacl-devel-2.3.1-2.12.aarch64.rpm"
RPM_HASH = "1a5bf7709568c0a9154f7613c4c00408659d54079bd9e4fd5813680b60b5291780bcb07e0714a79fb90209701858bc583597829d90dd7a6af2ddfb57408e8142"

RPROVIDES:${PN} += "acl-devel \
libacl-devel \
libacl-devel(aarch-64) \
pkgconfig(libacl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libacl1"

inherit rpm
