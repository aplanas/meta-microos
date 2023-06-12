SUMMARY = "Wayland compositor screenshot editor"
DESCRIPTION = "A Wayland native snapshot and editor tool"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "swappy-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "fa2b4c96d870a7abbe12a4140e3755804f94e51293e1b273cc06273f65624da56e0b812659a9fee2ae8867bee88fcd523abe793ab0423098c5ba219642d9cad0"

RPROVIDES:${PN} += "application() \
application(swappy.desktop) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
swappy \
swappy(aarch-64)"
RDEPENDS:${PN} += "fontawesome-fonts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
