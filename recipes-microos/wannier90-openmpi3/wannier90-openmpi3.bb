SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi3-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "fc13e69947410b816ff7c2897a229aa7c273cbc8a99659cde4bb823405896421e4c6e71ed6a83ee89295e2f765484dafd005001165f93fd5d447cdc20bbd39a2"

RPROVIDES:${PN} += "wannier90-openmpi3 \
wannier90-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.40()(64bit)"

inherit rpm
