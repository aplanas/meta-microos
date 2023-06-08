SUMMARY = "VDE plug library"
DESCRIPTION = "This package contains a library that makes programs able to connect \
to a local VDE switch. The simplest one is vde_plug, contained in the vde2 package."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdeplug3-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "4a11c45b052563cf7bfed81c3e2fc48eb5eb9a05b873f4fdaffedd4ab0a684e96796f655f25d9251530ede2eb3383a66b4ce227cde5e3c1ceae9eaa12781b307"

RPROVIDES:${PN} += "libvdeplug.so.3()(64bit) libvdeplug3 libvdeplug3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
