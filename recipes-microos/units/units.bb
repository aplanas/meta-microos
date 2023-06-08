SUMMARY = "Conversion Utility"
DESCRIPTION = "The 'units' program converts quantities expressed in various scales to \
their equivalents in other scales. \
 \
Units can also convert temperature values (Fahrenheit to Celsius, for \
example) but this needs a slightly different input syntax. See the man \
page for details."
LICENSE = "GPL-3.0-or-later"

PV = "2.22"

RPM_NAME = "units-2.22-1.3.aarch64.rpm"
RPM_HASH = "15adf47885fd75534ce054bc78c8dff85d13a9225c93e82795a6bfc1f73c7480b013102d4e7d70b7e0e022a6bcef903355653f37f5f3b821fd783953fcbc9c8e"

RPROVIDES:${PN} += "units units(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libreadline.so.8()(64bit) python3-requests"

inherit rpm
