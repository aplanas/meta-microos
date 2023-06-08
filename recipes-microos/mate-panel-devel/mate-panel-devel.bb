SUMMARY = "Development files for the MATE panel applet library"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-panel-devel-1.26.2-2.3.aarch64.rpm"
RPM_HASH = "80ef37f31a89953573d95916cb459ce238ca505d49923afa68e9f84b57de0b5e1617321cb4c42a889e747e8b8216dd0d0cb055094891bf71e0ff6f3db8700dfd"

RPROVIDES:${PN} += "mate-panel-devel mate-panel-devel(aarch-64) pkgconfig(libmatepanelapplet-4.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmate-panel-applet-4-1 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) typelib-1_0-MatePanelApplet-4_0"

inherit rpm
