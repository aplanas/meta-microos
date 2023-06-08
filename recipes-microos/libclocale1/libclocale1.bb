SUMMARY = "Library for C locale functions"
DESCRIPTION = "A library for C locale functions."
LICENSE = "LGPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "libclocale1-20221218-1.2.aarch64.rpm"
RPM_HASH = "bb6a839901fad2bfcbdcf12a727e335623411758494e4225fe337fbf9571e222d866a50a97c7f2ae1f8c691beba9248a8c8b4cf69e689210b34daca507c94d04"

RPROVIDES:${PN} += "libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libclocale1 libclocale1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit)"

inherit rpm
