SUMMARY = "User tools for zisofs"
DESCRIPTION = "Zisofs-tools, in conjunction with a zisofs-enabled system, allows the \
creation of an ISO-9660 filesystem that can be decompressed 'live' on a \
file-by-file basis, while still being readable by systems without \
zisofs support. This package contains the tools necessary to create \
such a filesystem and read compressed files on a system without zisofs \
support."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "zisofs-tools-1.0.8-26.8.aarch64.rpm"
RPM_HASH = "8ac3ad43943f797b7cdf4cde97f3fe496249bd4b04134f68187ec9cc04add6b7317ad3b434661899bcea4046ad29e9f24d918ad9a2b2078a3bec7036c2f40e78"

RPROVIDES:${PN} += "zisofs-tools zisofs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) mkisofs"

inherit rpm
