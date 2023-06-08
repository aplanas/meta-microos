SUMMARY = "Development files for the Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator-devel-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "93c63f5ed4043620710dedae44f44227adef9df1ea66393aaf2f59653f2eb0bcdf5e4147c99900ea7a7d3eb37ddc811acc381b608e04a7a5a7875ccabdc28bb8"

RPROVIDES:${PN} += "libayatana-indicator-devel libayatana-indicator-devel(aarch-64) pkgconfig(ayatana-indicator-0.4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libayatana-indicator7 pkgconfig(gtk+-2.0)"

inherit rpm
