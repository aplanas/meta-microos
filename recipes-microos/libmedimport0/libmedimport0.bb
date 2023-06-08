SUMMARY = "MED import Library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmedimport0-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "2cf9a75b30be5345c5bd00bb1da9b34281f693cae386c36666ab6a99f4be6ff06a8a1e47a50ba50c3b012932fbfdfd5d0427ef6d59f03c6aa7c8a11c2ea55d68"

RPROVIDES:${PN} += "libmedimport.so.0()(64bit) libmedimport0 libmedimport0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhdf5.so.200()(64bit) libmedC.so.11()(64bit)"

inherit rpm
