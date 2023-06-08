SUMMARY = "Development files for Weston plugins"
DESCRIPTION = "Weston is the reference implementation of a Wayland compositor, and a \
useful compositor in its own right. Weston has various backends that \
lets it run on Linux kernel modesetting and evdev input as well as \
under X11. \
 \
This package contains all necessary include files and libraries needed \
to develop plugins for Weston."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "11"

RPM_NAME = "weston-devel-11-3.1.aarch64.rpm"
RPM_HASH = "b849253c871220646b966c6227ab2f8f37a11c0a59f67b171ec6debef96c406f0d66e5a76ee62c0590c655ecb304cf3bdad076821b96b87b13bc847a792769b0"

RPROVIDES:${PN} += "pkgconfig(libweston-11) pkgconfig(libweston-11-protocols) pkgconfig(libweston-desktop-11) pkgconfig(weston) weston-devel weston-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libweston-11-0 pkgconfig(libweston-11) pkgconfig(pixman-1) pkgconfig(wayland-server) pkgconfig(xkbcommon)"

inherit rpm
