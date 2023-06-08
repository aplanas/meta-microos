SUMMARY = "Development libraries for libuv"
DESCRIPTION = "Development files for libuv. \
 \
libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.44.2"

RPM_NAME = "libuv-devel-1.44.2-3.3.aarch64.rpm"
RPM_HASH = "d41459c34ca309fb5e8b8774b9ae3609fdd47304327ea6d2fbb5ab2a05895a8b038e08674fad7f97bb9e79a81164bb453f9ebb1ea8d1f08db278efebd1ed8e9c"

RPROVIDES:${PN} += "libuv-devel libuv-devel(aarch-64) pkgconfig(libuv)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libuv1"

inherit rpm
