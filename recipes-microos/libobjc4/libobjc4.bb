SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libobjc4-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d0973a998d58358278166e9a2cbc24d57804db93816d52e794d83065fd5f37d2d416a656d58fc85778eb12c8061d2b441779ab940fc9896e9eca25a02629fb88"

RPROVIDES:${PN} += "libobjc.so.4()(64bit) libobjc4 libobjc4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
