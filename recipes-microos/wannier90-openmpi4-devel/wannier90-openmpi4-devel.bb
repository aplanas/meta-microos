SUMMARY = "Devel files for wannier90-openmpi4"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi4-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "cb233f91fc4400754c09789628803f063de165c7a8f9a22408bb4156cd2520afea57fc76741bdff06a494f5fedc19c7ccc47ac583790294920e156f74f13e690"

RPROVIDES:${PN} += "libwannier.so()(64bit) \
wannier90-openmpi4-devel \
wannier90-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.40()(64bit)"

inherit rpm
