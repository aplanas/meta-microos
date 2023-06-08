SUMMARY = "Python3 bindings for SSSD Murmur hash function"
DESCRIPTION = "This subpackage provides the python3 module for calculating the \
Murmur hash version 3."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "python3-sss-murmur-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "4356109b20465a349a16fba85cad62ea898d4749b55598b598c121a1ef6511f562af96423a3c9ed559632ab981e58a78ca70738c8183ab36c6f9363e077473e9"

RPROVIDES:${PN} += "python3-sss-murmur python3-sss-murmur(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python3"

inherit rpm
