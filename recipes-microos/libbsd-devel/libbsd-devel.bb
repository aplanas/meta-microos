SUMMARY = "Development headers and files for libbsd"
DESCRIPTION = "This library provides functions commonly found on BSD systems, and \
lacking on others like GNU systems, thus making it easier to port projects \
with strong BSD origins, without needing to embed the same code over and \
over again on each project."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd-devel-0.11.7-2.1.aarch64.rpm"
RPM_HASH = "d8ebc39a1407517568c9ca724c8f46ed6775ea7b9e53e3508d65afecfd355905fed6e8e84f603f0c7ce41044e342696a375163365f8302bfbc27d43d516bbc25"

RPROVIDES:${PN} += "libbsd-devel libbsd-devel(aarch-64) pkgconfig(libbsd) pkgconfig(libbsd-overlay)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libbsd0 libmd-devel"

inherit rpm
