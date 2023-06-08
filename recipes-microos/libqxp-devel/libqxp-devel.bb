SUMMARY = "Development files for libqxp"
DESCRIPTION = "The libqxp-devel package contains libraries and header files for \
developing applications that use libqxp."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-devel-0.0.2-1.19.aarch64.rpm"
RPM_HASH = "a90a44db6d602c0662a142576569c6b4c4df9f012089d8c1df61ab8cfdbc4edce9c6cd846d0fcded6a95954d4231d612e723fefed946ef84891ec471f2d95c17"

RPROVIDES:${PN} += "libqxp-devel libqxp-devel(aarch-64) pkgconfig(libqxp-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libqxp-0_0-0 pkgconfig(librevenge-0.0)"

inherit rpm
