SUMMARY = "Development files for the VLC media player system"
DESCRIPTION = "These development headers are required if you plan on coding against VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-devel-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "13fff1e1b5cb5ef25987730ea573f4637afd4f19f1ef790ca1dfb6afa281d3f48b0764bfe9cb761e6768a5f58c24e2269f6d6868725ad1c97471a0d9a6ca6025"

RPROVIDES:${PN} += "pkgconfig(libvlc) \
pkgconfig(vlc-plugin) \
vlc-devel \
vlc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
vlc-jack \
vlc-noX \
vlc-vdpau"

inherit rpm
