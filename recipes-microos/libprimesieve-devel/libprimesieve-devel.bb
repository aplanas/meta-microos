SUMMARY = "Development files for the primesieve library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primesieve library. \
It also contains the API documentation of the library."
LICENSE = "BSD-2-Clause"

PV = "11.0"

RPM_NAME = "libprimesieve-devel-11.0-1.3.aarch64.rpm"
RPM_HASH = "c7f87e8834899c69d8a2bccf25ecf08bbbc755e8a097de3e95f6ccabc167250b49d740e615a5264ef432493fcf2e607902b5a2858586ed1ac3fd687bc9f2c066"

RPROVIDES:${PN} += "cmake(primesieve) libprimesieve-devel libprimesieve-devel(aarch-64) pkgconfig(primesieve)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libprimesieve11"

inherit rpm
