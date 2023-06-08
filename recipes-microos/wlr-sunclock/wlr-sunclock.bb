SUMMARY = "Wayland desktop widget to show to the sun's shadows on earth"
DESCRIPTION = "Wayland desktop widget to show to the sun's shadows on earth."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "wlr-sunclock-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "6afb1c6e91b99fc049548097d57688899035987f2612d6bda06f31c0eb4f2fe155193fa4df47827ddb94ce2e5fbddef7fda0372f8256c4120d48c5a94229db02"

RPROVIDES:${PN} += "wlr-sunclock wlr-sunclock(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-layer-shell.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
