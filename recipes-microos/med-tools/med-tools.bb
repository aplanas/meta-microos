SUMMARY = "A library to store and exchange meshed data"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "med-tools-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "e2c8f90cacf2f6ef2667c52ddceae18713c943bde20113261a7d0a9bb21005d3619b1bfe4488331a051916aec8e1ecfe556d4f8b5b0d61e7d0e69d7be0a05755"

RPROVIDES:${PN} += "med-tools med-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/wish ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libmedC.so.11()(64bit) libmedimport.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
