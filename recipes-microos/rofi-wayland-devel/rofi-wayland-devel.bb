SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "1.7.5+wayland1"

RPM_NAME = "rofi-wayland-devel-1.7.5+wayland1-1.3.aarch64.rpm"
RPM_HASH = "293efd2aded07cf6fa25505e918e08474d81eb13c683ec9b1109254a34996bd170f5217cc5f4a17a12ca8aeb558b1764fdea03e40e5c60d0c53346854f912ec8"

RPROVIDES:${PN} += "pkgconfig(rofi) rofi-wayland-devel rofi-wayland-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(cairo) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0)"

inherit rpm
