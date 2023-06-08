SUMMARY = "MPRIS plugin for mpv"
DESCRIPTION = "This package contains a plugin for mpv which allows control of the \
player using the MPRIS D-Bus interface, which enables control with \
multimedia keys in desktop environments such as GNOME and KDE \
as well as through tools like playerctl."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "mpv-mpris-1.0-1.1.aarch64.rpm"
RPM_HASH = "b0a430a6c03e88ec6821036afefe5476acb4431153c67a53f6a83c11952b3d147ee7e0d41d00ed6cf5ed047faa00233a295b74fd0969fe9388d4197bbd45f383"

RPROVIDES:${PN} += "mpv-mpris mpv-mpris(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
