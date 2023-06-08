SUMMARY = "Library for solving the problem of harmonic inversion"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libharminv3-1.4.1-1.18.aarch64.rpm"
RPM_HASH = "900bf624bf9ee6beaf19217150fd34047a1efec1d8e5768eb8bc6ef5e169e6d556b8e14b7e2e1259cb1e88afe0028361e04d79d3c6b4aeb8014351fffad87c3f"

RPROVIDES:${PN} += "libharminv.so.3()(64bit) libharminv3 libharminv3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
