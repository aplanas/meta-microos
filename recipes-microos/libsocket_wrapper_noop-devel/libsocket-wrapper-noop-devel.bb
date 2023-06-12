SUMMARY = "Development headers for libsocket_wrapper_noop"
DESCRIPTION = "Development headers for applications with the need to call \
socket_wrapper_enabled()."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libsocket_wrapper_noop-devel-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "ea7c3fdc70366c1b09ac78f10879ad46d2e8123a8974ce6701b92241dcdae3ceb0b53e07b1e38bdaedd25c0482c52c1eb7e04e89783fcb0a086fb22b8a9764b0"

RPROVIDES:${PN} += "cmake(socket_wrapper) \
cmake(socket_wrapper_noop) \
libsocket_wrapper_noop-devel \
libsocket_wrapper_noop-devel(aarch-64) \
pkgconfig(socket_wrapper_noop)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocket_wrapper_noop0"

inherit rpm
