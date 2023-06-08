SUMMARY = "Development files for LAL Pulsar"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Pulsar library."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "lalpulsar-devel-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "d4573d1d83444284302b8d5b3b3a22ee84f0b22860232786edd1d5aff130c95088b1e31d9d633c65f9db27147c8bfe772107437ecfe7f1d6cd42af56f4e5a9c5"

RPROVIDES:${PN} += "config(lalpulsar-devel) lalpulsar-devel lalpulsar-devel(aarch-64) pkgconfig(lalpulsar)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3.10 /usr/bin/tclsh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcfitsio.so.10()(64bit) libgsl.so.25()(64bit) liblal.so.20()(64bit) liblalframe.so.13()(64bit) liblalinference.so.23()(64bit) liblalpulsar.so.26()(64bit) liblalpulsar26 liblalsimulation.so.31()(64bit) liblalsupport.so.14()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) pkgconfig(cfitsio) pkgconfig(fftw3) pkgconfig(gsl) pkgconfig(lal) pkgconfig(lalframe) pkgconfig(lalinference) pkgconfig(lalsimulation)"

inherit rpm
