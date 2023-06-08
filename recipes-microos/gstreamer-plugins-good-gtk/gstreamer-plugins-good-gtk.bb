SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-good-gtk-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "47d60c18d467a7afe0408c242fcce370f560a6ebf76bb6c15a10d941e36269a40f12c47ba26223f9c8638283a478085947bba6c81f3aae1a5ecc0648a4a2120d"

RPROVIDES:${PN} += "gstreamer-plugins-good-gtk gstreamer-plugins-good-gtk(aarch-64) gstreamer1(element-gtkglsink)()(64bit) gstreamer1(element-gtksink)()(64bit) libgstgtk.so()(64bit)"
RDEPENDS:${PN} += "gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstgl-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
