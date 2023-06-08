SUMMARY = "Dynamic libraries from mopac7"
DESCRIPTION = "MOPAC7 is a semi-empirical quantum-mechanics code written by James J. P. \
Stewart and co-workers. The purpose of this project is to maintain MOPAC7 as \
a stand-alone program as well as a library that provides the functionality \
of MOPAC7 to other programs. \
 \
This package contains dynamic libraries."
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "libmopac7-1-1.15-8.3.aarch64.rpm"
RPM_HASH = "a5bdd32460fd100098833bce3bf48976913da18a04c0b0e1629d3747bebe4d777caa68f35f0a268b2c59ef9d4d7f9e466b7e2e742b4436a4e34e07b11630962a"

RPROVIDES:${PN} += "libmopac7-1 libmopac7-1(aarch-64) libmopac7.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
