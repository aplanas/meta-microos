SUMMARY = "Development files for the libxkbcommon-x11 library"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. \
 \
This package contains the development headers for the library found \
in libxkbcommon-x11-0."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-x11-devel-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "233f1003d08142d96b4df902e49ca5e526ee66b7272438ce72c70f3024d6f3a862e5367514cd3c63cebf35b0d2d80efbff392d3b72c44deaf06f9db63e211147"

RPROVIDES:${PN} += "libxkbcommon-x11-devel libxkbcommon-x11-devel(aarch-64) pkgconfig(xkbcommon-x11)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libxkbcommon-x11-0 pkgconfig(xcb) pkgconfig(xcb-xkb) pkgconfig(xkbcommon)"

inherit rpm
