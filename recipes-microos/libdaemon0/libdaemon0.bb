SUMMARY = "Lightweight C library That Eases the Writing of UNIX Daemons"
DESCRIPTION = "libdaemon is a lightweight C library that eases the writing of UNIX \
daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14"

RPM_NAME = "libdaemon0-0.14-19.7.aarch64.rpm"
RPM_HASH = "a032d56cc2af79a9bad12b57dcb2bdc841f01143be0e324f3e6ee3fbceadc8f2af49c67f7482fe2212423a5cd6e763eaf6d769d9fa418ff0b24c4f3ac78a62c7"

RPROVIDES:${PN} += "libdaemon libdaemon.so.0()(64bit) libdaemon0 libdaemon0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
