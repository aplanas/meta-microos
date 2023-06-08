SUMMARY = "Documentation for qt6-wayland in QCH format"
DESCRIPTION = "This package contains documentation for qt6-wayland in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-wayland-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "99193b14d3fc8a452f367464440b5a41a5c71346f9b25dd5a002117c8352dd48fd00b2c9f6c43e3270cf2910b1c4d9e3e9107e866efaaa3f55c540149ce603eb"

RPROVIDES:${PN} += "qt6-wayland-docs-qch qt6-wayland-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
