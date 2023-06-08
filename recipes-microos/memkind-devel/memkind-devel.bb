SUMMARY = "Development files for the 'memkind' user extensible heap manager"
DESCRIPTION = "Header files for building applications with libmemkind."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "memkind-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "7df0d180d435b6e08a043e995e4f6722248421d1ad0b6cbd1994fb9a98984fd129d6bc584532de3a921a6f7f2d9917497f072cf491c1d03f9504d216e4e07eec"

RPROVIDES:${PN} += "memkind-devel memkind-devel(aarch-64) pkgconfig(memkind)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmemkind0"

inherit rpm
