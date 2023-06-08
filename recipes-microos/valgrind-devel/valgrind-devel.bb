SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the Valgrind header files."
LICENSE = "GPL-2.0-or-later"

PV = "3.20.0"

RPM_NAME = "valgrind-devel-3.20.0-3.1.aarch64.rpm"
RPM_HASH = "7922dd11c288a13f35910a238bed4891c10aecf389fee1c4d14046b420614ecbe42db27a931bf663b2ad7490c15612e7552bdc029c36b10e38baad4e5c0e09ca"

RPROVIDES:${PN} += "pkgconfig(valgrind) valgrind-devel valgrind-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config valgrind valgrind-client-headers"

inherit rpm
