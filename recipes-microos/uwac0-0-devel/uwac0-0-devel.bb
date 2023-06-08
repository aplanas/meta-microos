SUMMARY = "Remote Desktop Toolkit libuwac development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the uwac library."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "uwac0-0-devel-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "ffb7023ddbc1b17659c08a46ed9f43e754f1b466d3f59e44be9e5c15c73aeb33871d0dfec427238110ade5a52b5b1ac70feb9cdbcfd82dc2a28aa6b57fbec68c"

RPROVIDES:${PN} += "cmake(uwac) libuwac0-devel pkgconfig(uwac0) uwac0-0-devel uwac0-0-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake libuwac0-0 pkgconfig(freerdp2) pkgconfig(wayland-client) pkgconfig(xkbcommon)"

inherit rpm
