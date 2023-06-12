SUMMARY = "Solver for the problem of harmonic inversion"
DESCRIPTION = "Harminv is a program to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "harminv-1.4.1-1.18.aarch64.rpm"
RPM_HASH = "10382aa5cde3e5239cdb9f25cbe66fd92e42d0ee619d7da400b9cb36c1e4fdff63869b0ed83db1d9869c225e9cd267a457abed83c9a1b6d1ccde7221b2bc6536"

RPROVIDES:${PN} += "harminv \
harminv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libharminv.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
