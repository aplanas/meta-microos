SUMMARY = "Development files for libbs2b"
DESCRIPTION = "Headers and libraries to program against libbs2b."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libbs2b-devel-3.1.0-13.3.aarch64.rpm"
RPM_HASH = "88c4a200794d56dd680e5385784e42987c7e2495e8aefbf67f8cd998be64811b86084cacacdb20dd557ba22631a22c550d279fcdbd5c5c54b9a24a50466925f2"

RPROVIDES:${PN} += "libbs2b-devel libbs2b-devel(aarch-64) pkgconfig(libbs2b)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbs2b0"

inherit rpm
