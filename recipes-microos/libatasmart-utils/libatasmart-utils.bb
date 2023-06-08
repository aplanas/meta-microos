SUMMARY = "ATA S.M.A.R.T. Disk Health Monitoring Library - Utilities"
DESCRIPTION = "A small and lightweight parser library for ATA S.M.A.R.T. hard disk \
health monitoring."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19"

RPM_NAME = "libatasmart-utils-0.19-10.12.aarch64.rpm"
RPM_HASH = "968754f4d257ecd995587473cd6692832c840ec93f3ccbcad00ce36ddb055e441a5a8a919e610679484c7f7555378f39aa081b56ee135d1db0cfd74eee057a10"

RPROVIDES:${PN} += "libatasmart-utils libatasmart-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatasmart.so.4()(64bit) libatasmart4 libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
