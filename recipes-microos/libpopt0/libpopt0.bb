SUMMARY = "A C library for parsing command line parameters"
DESCRIPTION = "Popt is a C library for parsing command line parameters.  Popt was \
heavily influenced by the getopt() and getopt_long() functions. It \
improves on them by allowing more powerful argument expansion. Popt can \
parse arbitrary argv[] style arrays and automatically set variables \
based on command line arguments.  Popt allows command line arguments to \
be aliased via configuration files and includes utility functions for \
parsing arbitrary strings into argv[] arrays using shell-like rules."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "libpopt0-1.19-1.3.aarch64.rpm"
RPM_HASH = "115e70cf6085be05929c81ef0dfe1dc7db3edb9a027aa6b2409eae0833be7828049a10d815d288bf29ff30371961cc7f32537ddce2473c9143d5315a506d9e14"

RPROVIDES:${PN} += "libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libpopt0 libpopt0(aarch-64) popt"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
