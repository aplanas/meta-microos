SUMMARY = "Tool for Controlling the Special Features of an U3 USB Flash disk"
DESCRIPTION = "u3-tool is a tool for unlocking and configuring U3 smart USB Flash devices.  It \
supports changing the virtual CD partition size, replacing the CD image, \
enabling, disabling, and resetting device security, and unlocking the secured \
data partition."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+svn60"

RPM_NAME = "u3-tool-1.0+svn60-2.3.aarch64.rpm"
RPM_HASH = "2bb318aff6159cbc38b75d95ab0b7f118bb6004e4d0da82f5e6b246d08191f80035898d9024bf22afcb37eec057dfa9c0b17c6ae775014bffad30e5f7e24d3d8"

RPROVIDES:${PN} += "u3-tool \
u3-tool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
