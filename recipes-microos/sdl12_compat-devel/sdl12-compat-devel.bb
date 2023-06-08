SUMMARY = "Libraries, includes and more to develop SDL-1.2 applications"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "MIT"

PV = "1.2.60"

RPM_NAME = "sdl12_compat-devel-1.2.60-1.7.aarch64.rpm"
RPM_HASH = "942a1c46b40745b46e618cafa618cda2de1ca34c112828831a76a0fef709f77ced2226e2170a16043d3b1fc1e4e7b6e4ccdee9ab6f8d8f9296ae4196480244df"

RPROVIDES:${PN} += "SDL-devel libSDL-devel pkgconfig(sdl) pkgconfig(sdl12_compat) sdl12_compat-devel sdl12_compat-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libSDL-1_2-0 pkgconfig(gl) pkgconfig(glu) pkgconfig(x11) pkgconfig(xproto)"

inherit rpm
