SUMMARY = "Development files for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-devel-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "7e17aeb87741b0b01417f302952f68b31a0c2c6524b74c1888ba0f4bae15ed4fdff527c606571f84f790c1073a79776223c5ea50ef7564e0f5e7bfbd972d21fc"

RPROVIDES:${PN} += "cmake(SOCI) soci-devel soci-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers-devel libsoci_core4_0"

inherit rpm
