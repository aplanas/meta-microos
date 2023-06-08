SUMMARY = "Development files for the X version 10 compatibility library"
DESCRIPTION = "X version 10 backwards compatibility for prehistoric X applications. \
 \
This package contains the development headers for the library found \
in liboldX6."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "liboldX-devel-1.0.1-12.1.aarch64.rpm"
RPM_HASH = "5b8d88da787e61bc7eeb3c0c359295f0c007f45fbd01614a58e516c90cae72b31fedb90a8c73349f416a54ed74de8dc5ffc8965d739718b7f01edd227febd171"

RPROVIDES:${PN} += "liboldX-devel liboldX-devel(aarch-64) pkgconfig(oldx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liboldX6 pkgconfig(x11)"

inherit rpm
