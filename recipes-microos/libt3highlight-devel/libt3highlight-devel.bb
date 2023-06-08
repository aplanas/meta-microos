SUMMARY = "Development files for libt3highlight, a syntax highlighting library"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3highlight."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight-devel-0.5.0-1.15.aarch64.rpm"
RPM_HASH = "60d60cb6d4000488f18700cb1dd343b8a62920780fa5853701dbad88421fbbaf2dd7f3af2e3a2a33a74ac6f2b4737d6da33fe82591710d91bdb9b0fa95dab4ec"

RPROVIDES:${PN} += "libt3highlight-devel libt3highlight-devel(aarch-64) pkgconfig(libt3highlight)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libt3highlight2 pkgconfig(libpcre2-8) pkgconfig(libt3config)"

inherit rpm
