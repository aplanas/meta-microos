SUMMARY = "Development files for LAL Inspiral"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Inspiral library."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "lalinspiral-devel-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "3a91e2522a64c977090eac2fc0640ee88e1bca2906d759db88533069b9c3b3bc7339d3eb538859ac3a7b50b810ef4f2b1eabdc3eef5076ae71611de298025ec3"

RPROVIDES:${PN} += "config(lalinspiral-devel) lalinspiral-devel lalinspiral-devel(aarch-64) pkgconfig(lalinspiral)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblal.so.20()(64bit) liblalinspiral.so.17()(64bit) liblalinspiral17 pkgconfig(gsl) pkgconfig(lal) pkgconfig(lalburst) pkgconfig(lalframe) pkgconfig(lalmetaio) pkgconfig(lalsimulation) pkgconfig(libmetaio)"

inherit rpm
