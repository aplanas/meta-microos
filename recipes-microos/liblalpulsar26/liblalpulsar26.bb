SUMMARY = "Shared library for LAL Pulsar"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Pulsar library."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "liblalpulsar26-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "c11558051c55f788822074bf765c5402256040749bed0f890035010764d1fcb6abbdf30d96ec73e3180554761a0eb61fe52f86ba6f45151540e4bef88827d109"

RPROVIDES:${PN} += "liblalpulsar.so.26()(64bit) liblalpulsar26 liblalpulsar26(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcfitsio.so.10()(64bit) libfftw3.so.3()(64bit) libfftw3f.so.3()(64bit) libgsl.so.25()(64bit) liblal.so.20()(64bit) liblalframe.so.13()(64bit) liblalinference.so.23()(64bit) liblalsimulation.so.31()(64bit) liblalsupport.so.14()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
