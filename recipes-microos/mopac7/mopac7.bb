SUMMARY = "Semi-empirical quantum mechanics suite"
DESCRIPTION = "MOPAC7 is a semi-empirical quantum-mechanics code written by James J. P. \
Stewart and co-workers. The purpose of this project is to maintain MOPAC7 as \
a stand-alone program as well as a library that provides the functionality \
of MOPAC7 to other programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "mopac7-1.15-8.3.aarch64.rpm"
RPM_HASH = "23b2c96b42ad3ab5dc427df315d71fefcb1c1c86aebd7b45748514a01d52182659a91630213139001dab82153eb82bd8015033ea92b15b07d465af656d63986a"

RPROVIDES:${PN} += "mopac7 \
mopac7(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libmopac7.so.1()(64bit)"

inherit rpm
