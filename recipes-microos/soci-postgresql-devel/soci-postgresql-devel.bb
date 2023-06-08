SUMMARY = "Development files for the soci PostgreSQL back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-postgresql-devel-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "42d232dc4d54e9d5d274c9f08be56d09348cd383aae70e733d75042fcd35f08afb43fc6dce1c529854bef05db5ed5c6a1dcdfdc62345da891a18688f381f2863"

RPROVIDES:${PN} += "soci-postgresql-devel soci-postgresql-devel(aarch-64)"
RDEPENDS:${PN} += "libsoci_postgresql4_0 pkgconfig(libpq) soci-devel"

inherit rpm
