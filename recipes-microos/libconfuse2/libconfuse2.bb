SUMMARY = "A configuration file parser library"
DESCRIPTION = "libConfuse is a configuration file parser library. It supports \
sections and (lists of) values (strings, integers, floats, booleans \
or other sections), as well as single/double-quoted strings, \
environment variable expansion, functions and nested include \
statements."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3"

RPM_NAME = "libconfuse2-3.3-2.3.aarch64.rpm"
RPM_HASH = "38c150a213a2fae377183b3f1bfc3fbb2c4eb6651640a50199f89c1607151e6db62a76879adf38f43384a95eeaaec3896a52e75c6ad442e1439487af3d48aeca"

RPROVIDES:${PN} += "libconfuse.so.2()(64bit) libconfuse2 libconfuse2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
