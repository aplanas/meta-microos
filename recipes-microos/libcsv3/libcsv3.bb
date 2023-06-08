SUMMARY = "Library to Read and Write CSV Data"
DESCRIPTION = "libcsv is a CSV library written in ANSI C89 that can read and write \
CSV data. It provides an interface using callback functions to handle \
parsed fields and rows and can parse improperly formatted CSV files."
LICENSE = "LGPL-2.1+"

PV = "3.0.3"

RPM_NAME = "libcsv3-3.0.3-2.24.aarch64.rpm"
RPM_HASH = "cf79fee9f5661b30456e013c1c55a8ee768823d3cf913e20ac04fa9369b072577453bf04ccde9d91aba7c0308fae9a7d27650ab14cd99ea05fcdf35dff5adcbc"

RPROVIDES:${PN} += "libcsv.so.3()(64bit) libcsv3 libcsv3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
