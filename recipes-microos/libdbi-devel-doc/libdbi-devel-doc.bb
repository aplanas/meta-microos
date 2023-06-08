SUMMARY = "Development documentation for libdbi"
DESCRIPTION = "The libdbi-devel-doc package contains libdbi programmers-guide \
and driver-guide."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi-devel-doc-0.9.0.g33-4.9.noarch.rpm"
RPM_HASH = "a1b551d18dc4ce18372e9c6abebb92986e16ec51147556b501d77298af0f1541be39a983415e9842ba0e7a882614bbc070102f8bbb790bc1f2eb7bdb38b339f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbi-devel-doc libdbi-devel:/usr/share/doc/packages/libdbi/driver-guide.pdf"
RDEPENDS:${PN} += ""

inherit rpm
