SUMMARY = "The TCP wrapper library"
DESCRIPTION = "This package contains a library which implements classifying incoming \
requests (connections) based upon rule exclusion files (/etc/hosts.*)."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "libwrap0-7.6-895.3.aarch64.rpm"
RPM_HASH = "786fb4b9275d7ac4db351ce9329c4eead48b16c66badfd601b946a24b1d59354abe982a161f6769663fabeadf8d8800c2139c5a3aec69e41851581aaa2811e24"

RPROVIDES:${PN} += "config(libwrap0) libwrap.so.0()(64bit) libwrap0 libwrap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
