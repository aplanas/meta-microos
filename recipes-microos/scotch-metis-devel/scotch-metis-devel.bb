SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-metis-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e5bda5be0e232d3218639ce13ccba72a4a95baf85ab6a655bc9c54b62d9df6b5909eee52f1abafbaf4c98b4f7df0118b45d6f805548aa27962d222696b5bf8f2"

RPROVIDES:${PN} += "scotch-metis-devel scotch-metis-devel(aarch-64)"
RDEPENDS:${PN} += "libscotch0 scotch-devel"

inherit rpm
