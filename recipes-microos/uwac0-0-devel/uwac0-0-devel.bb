SUMMARY = "Remote Desktop Toolkit libuwac development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the uwac library."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "uwac0-0-devel-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "60bb0e440d31d50681fc71e54511ddc42f4763443d7e6e3e0856bb22df31bebf9f35393220b140e8c374b322cf414b92cbe4ef08fc20cf6cb1f113a6e80b07a2"

RPROVIDES:${PN} += "cmake(uwac) \
libuwac0-devel \
pkgconfig(uwac0) \
uwac0-0-devel \
uwac0-0-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libuwac0-0 \
pkgconfig(freerdp2) \
pkgconfig(wayland-client) \
pkgconfig(xkbcommon)"

inherit rpm
