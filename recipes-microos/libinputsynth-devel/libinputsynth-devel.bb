SUMMARY = "Synthesize keyboard and mouse input on X11 and Wayland with various backends"
DESCRIPTION = "Synthesize keyboard and mouse input on X11 and Wayland with various backends."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "libinputsynth-devel-0.15.0-1.4.aarch64.rpm"
RPM_HASH = "490c3404bb1a874a906eac7aca49d3319545a131cc25bf9879be87afa300d047fe38f460845fd42a38e34094173788c4a0b2edd9ac4b827624650ba9641781f1"

RPROVIDES:${PN} += "libinputsynth-devel libinputsynth-devel(aarch-64) pkgconfig(libinputsynth-0.15)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libinputsynth0_15-0 pkgconfig(glib-2.0)"

inherit rpm
