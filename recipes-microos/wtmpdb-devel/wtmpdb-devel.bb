SUMMARY = "Development files for libwtmpdb"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read, write or modify the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "wtmpdb-devel-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "685a048b37f2adccac143a210f1eb4d460102901afabdda5afb67ba7a3d161a537cbee9ce0b42e3fa90e72263083e6a023f81916b04eb6cc68246172cf704b0e"

RPROVIDES:${PN} += "pkgconfig(libwtmpdb) wtmpdb-devel wtmpdb-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwtmpdb0"

inherit rpm
