SUMMARY = "Simple GUI Frontend to x11vnc"
DESCRIPTION = "x11vnc allows one to remotely view and interact with real X displays (i.e. a \
display corresponding to a physical monitor, keyboard, and mouse) with any VNC \
viewer. In this way it plays the role for Unix/X11 that WinVNC plays for \
Windows. \
 \
This package adds a simple GUI frontend to run x11vnc."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.16"

RPM_NAME = "x11vnc-frontend-0.9.16-2.13.aarch64.rpm"
RPM_HASH = "1f652c6006ad4d815acb10b0c194e74a5b261e243b8a9440aab386433db37ed1e49d443c53f066c6dec087201029ccd7d9677dd5374d46292c246d337cdcf437"

RPROVIDES:${PN} += "application() application(tkx11vnc.desktop) x11vnc-frontend x11vnc-frontend(aarch-64)"
RDEPENDS:${PN} += "/bin/sh tcl tk x11vnc"

inherit rpm
