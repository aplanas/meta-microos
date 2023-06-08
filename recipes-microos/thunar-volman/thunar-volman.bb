SUMMARY = "Thunar Volume Manager"
DESCRIPTION = "The Thunar Volume Manager is an extension for the Thunar file manager, \
which enables automatic management of removable drives and media. For \
example, if thunar-volman is installed and configured properly, and you \
plug in your digital camera, it will automatically launch your \
preferred photo application and import the new pictures from the camera \
into your photo collection."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "thunar-volman-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "94ca6312c6ebce99529142371f5bfc56e5624454e5d77b284213bc1068572c4895c31decb1d040d534a64a5e620d5108a60b3b38ab387cd96e94272828a61ed8"

RPROVIDES:${PN} += "application() application(thunar-volman-settings.desktop) thunar-volman thunar-volman(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgudev-1.0.so.0()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit)"

inherit rpm
