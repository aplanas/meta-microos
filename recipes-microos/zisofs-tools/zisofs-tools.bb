SUMMARY = "User tools for zisofs"
DESCRIPTION = "Zisofs-tools, in conjunction with a zisofs-enabled system, allows the \
creation of an ISO-9660 filesystem that can be decompressed 'live' on a \
file-by-file basis, while still being readable by systems without \
zisofs support. This package contains the tools necessary to create \
such a filesystem and read compressed files on a system without zisofs \
support."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "zisofs-tools-1.0.8-27.1.aarch64.rpm"
RPM_HASH = "086f84de13a1d15de37e30e73a43e2655c463297caddca4164b55b69ba79674341eaef7b0d193a24cec2a1e03578675da0a5afacc392abfdfad66e700fa93bc5"

RPROVIDES:${PN} += "zisofs-tools \
zisofs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
mkisofs"

inherit rpm
