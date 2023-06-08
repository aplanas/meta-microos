SUMMARY = "Header files for MATE Control Center"
DESCRIPTION = "The control center is MATE's main interface for configuration of various \
aspects of your desktop. \
 \
This package provides MATE control center development files."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-control-center-devel-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "72bc8235b8696f860f28426d10635823bf88fb66ba22a4b3cb0d876e708484b5f622a702b5c2614108e2ac12d865c920a6be35d87550bde64fbc7096e9e9e668"

RPROVIDES:${PN} += "mate-control-center-devel mate-control-center-devel(aarch-64) pkgconfig(mate-default-applications) pkgconfig(mate-keybindings) pkgconfig(mate-window-settings-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmate-window-settings1 pkgconfig(gtk+-3.0) pkgconfig(mate-desktop-2.0)"

inherit rpm
