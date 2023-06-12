SUMMARY = "System Load Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Systemload plugin can display the current CPU load, used memory and swap \
space as well as the system uptime in the panel."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "xfce4-systemload-plugin-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "5f051ff7373de2ec6d772b68aecbe05e05913ae66404922bad9cf3f84fa85fb22b78c79d870dafb05966b59c32d66c4f6a373c0526820ce00da32e295e506a12"

RPROVIDES:${PN} += "libsystemload.so()(64bit) \
xfce4-panel-plugin-systemload \
xfce4-systemload-plugin \
xfce4-systemload-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfce4-panel"

inherit rpm
