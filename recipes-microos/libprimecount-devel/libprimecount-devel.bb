SUMMARY = "Development files for the primecount library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primecount library."
LICENSE = "BSD-2-Clause"

PV = "7.6"

RPM_NAME = "libprimecount-devel-7.6-1.3.aarch64.rpm"
RPM_HASH = "55bd25247356b2c6d727484fe99772a95fc2370b8090fea2118b2f57f29d0492b3c79138f630a80cdc1f06cd10241159a4a52338d1cd06e1ca9e4c47e98764ac"

RPROVIDES:${PN} += "libprimecount-devel libprimecount-devel(aarch-64) pkgconfig(primecount)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libprimecount7 pkgconfig(primesieve)"

inherit rpm
