SUMMARY = "An alternate Linux/POSIX capabilities library"
DESCRIPTION = "libcap-ng is a library providing an alternate mechanism to libcap to \
inspect and set Linux process and file capabilities (modeled upon a \
withdrawn POSIX.1e draft)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng0-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "b3560bbfa4760837104d948301836040d151a43b06443dc6c28d7d56e50454458189a5e12b0d247ba7ed2c18aae428405d0260d471710c2e9225154dd1ac5499"

RPROVIDES:${PN} += "libcap-ng.so.0()(64bit) libcap-ng0 libcap-ng0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
