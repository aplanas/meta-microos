SUMMARY = "Development files for the soci MariaDB back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-mysql-devel-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "1bb9530a258e443a91201cfc8086ee269e308711f52f8fe39f19093b389f9667b6eef815047831838f469b042f9e8a209dad5397b3557552138df22961b6d382"

RPROVIDES:${PN} += "soci-mysql-devel soci-mysql-devel(aarch-64)"
RDEPENDS:${PN} += "libsoci_mysql4_0 pkgconfig(libmariadb) soci-devel"

inherit rpm
