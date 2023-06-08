SUMMARY = "Sound Conversion Tools"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1+ & GPL-2.0+"

PV = "14.4.2"

RPM_NAME = "sox-14.4.2-5.31.aarch64.rpm"
RPM_HASH = "cdeeef1190685465ca3e7c320344a63b48c419895281a31eff832684da66c2820d858ac16ca0534ac5fc12c46933ed8489cddd39d0e2b8cea0cd2d828079d1e7"

RPROVIDES:${PN} += "sox sox(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsox.so.3()(64bit)"

inherit rpm
