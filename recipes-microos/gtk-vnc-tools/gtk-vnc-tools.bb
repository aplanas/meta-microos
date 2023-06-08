SUMMARY = "VNC Tools based on gtk-vnc"
DESCRIPTION = "This package contains tools based on gtk-vnc: \
 \
 - gvnccapture: a tool to capture a screenshot of the VNC desktop \
 \
 - gvncviewer: a simple VNC client"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "gtk-vnc-tools-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "eb622cd68693a59f3290deabd13698430e0ceaf17b6712374f18e26b1aba9b9fc4a3d609e97432e3b9a2f55622bba980971f56ab6887f1a4b7cd8cd2567551e3"

RPROVIDES:${PN} += "gtk-vnc-tools gtk-vnc-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-vnc-2.0.so.0()(64bit) libgvnc-1.0.so.0()(64bit) libgvncpulse-1.0.so.0()(64bit)"

inherit rpm
