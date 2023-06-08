SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "wlroots10-devel-0.15.1-1.4.aarch64.rpm"
RPM_HASH = "2599a79176b1cd348cb317d62b3bdd107fda12235b510c0b0b179f03757e6f9acf2304eb302cd66802e4c51a32c0c719e817eec1f6bf7be3519c7590c0fce31c"

RPROVIDES:${PN} += "pkgconfig(wlroots) wlroots10-devel wlroots10-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwlroots10 pkgconfig(egl) pkgconfig(gbm) pkgconfig(glesv2) pkgconfig(libdrm) pkgconfig(libinput) pkgconfig(libseat) pkgconfig(libudev) pkgconfig(pixman-1) pkgconfig(vulkan) pkgconfig(wayland-client) pkgconfig(wayland-server) pkgconfig(xcb) pkgconfig(xcb-composite) pkgconfig(xcb-dri3) pkgconfig(xcb-errors) pkgconfig(xcb-icccm) pkgconfig(xcb-present) pkgconfig(xcb-render) pkgconfig(xcb-renderutil) pkgconfig(xcb-res) pkgconfig(xcb-shm) pkgconfig(xcb-xfixes) pkgconfig(xcb-xinput) pkgconfig(xkbcommon)"

inherit rpm
