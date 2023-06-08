SUMMARY = "C++ Client Library for PostgreSQL"
DESCRIPTION = "This package contains header files needed for writing \
C++ programs that connect to a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "6.4.5"

RPM_NAME = "libpqxx-devel-6.4.5-1.19.aarch64.rpm"
RPM_HASH = "203c889baae3eed384b76b2c1d7504e3782e17c43034919695765dfbcd371609c41f9f40e01d310b20c5c10f2084300c76783e64db19e67343018bfe48150887"

RPROVIDES:${PN} += "libpqxx-devel libpqxx-devel(aarch-64) pkgconfig(libpqxx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpqxx-6_4"

inherit rpm
