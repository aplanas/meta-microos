SUMMARY = "A Library to Access SMI MIB Information"
DESCRIPTION = "The purpose of libsmi is to \
 \
* Give network management applications a concise programmer-friendly \
   interface to access MIB module information \
 \
* Separate the knowledge on SMI from the main parts of management \
   applications \
 \
* Allow addition of new kinds of MIB repositories without the need to \
adapt applications that make use of libsmi"
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi-0.4.8-25.7.aarch64.rpm"
RPM_HASH = "3f0aae86a313791944f19f33df2917402b5c2fe0bdc8f427989d83a2f8e1458b58f56996a3925fb84557cbfdbb6a9d64db415e96b8432cda9bcd84bf61782a08"

RPROVIDES:${PN} += "libsmi libsmi(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsmi.so.2()(64bit)"

inherit rpm
