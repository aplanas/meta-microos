SUMMARY = "Development files for libxklavier"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier-devel-5.4-1.7.aarch64.rpm"
RPM_HASH = "7421af4d23f65c0cc0ca7f71e4cb2f688004824481415982c44ae54695358b21358c5849faa52674da7c6b7496d01db9e7becbd5d1259d1e5b7aadb4ae666517"

RPROVIDES:${PN} += "libxklavier-devel \
libxklavier-devel(aarch-64) \
pkgconfig(libxklavier)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libxklavier \
libxklavier16 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-Xkl-1_0"

inherit rpm
