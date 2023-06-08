SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.16.2"

RPM_NAME = "wlroots-devel-0.16.2-1.3.aarch64.rpm"
RPM_HASH = "eca9bf317c51fa5488ed56a82eed2737a7ed714dce58e21441610e63ce9b8fc27122a0b95ebb9768fa066c175a2776221f78b7c56beba652a35ff3036a1371cb"

RPROVIDES:${PN} += "pkgconfig(wlroots) wlroots-devel wlroots-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwlroots11 pkgconfig(egl) pkgconfig(gbm) pkgconfig(glesv2) pkgconfig(libdrm) pkgconfig(libinput) pkgconfig(libseat) pkgconfig(libudev) pkgconfig(pixman-1) pkgconfig(vulkan) pkgconfig(wayland-client) pkgconfig(wayland-server) pkgconfig(xcb) pkgconfig(xcb-composite) pkgconfig(xcb-dri3) pkgconfig(xcb-errors) pkgconfig(xcb-icccm) pkgconfig(xcb-present) pkgconfig(xcb-render) pkgconfig(xcb-renderutil) pkgconfig(xcb-res) pkgconfig(xcb-shm) pkgconfig(xcb-xfixes) pkgconfig(xcb-xinput) pkgconfig(xkbcommon)"

inherit rpm
