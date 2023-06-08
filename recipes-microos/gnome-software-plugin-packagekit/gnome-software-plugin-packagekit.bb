SUMMARY = "GNOME Software Store - PackageKit plugin"
DESCRIPTION = "This subpackage provides the packagekit plugin used by \
the GNOME software store."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-software-plugin-packagekit-44.1-1.1.aarch64.rpm"
RPM_HASH = "819755a9c7c47745a1f786a58274da408460c96fb94b08bc705f07f0bbdf543743c4d66e8f47774c74c1af5918cc542939f43a9aedae1d98f1237587a0e2d0fc"

RPROVIDES:${PN} += "gnome-software-plugin-packagekit gnome-software-plugin-packagekit(aarch-64) libgs_plugin_appstream.so()(64bit) libgs_plugin_packagekit.so()(64bit)"
RDEPENDS:${PN} += "(libzypp-plugin-appdata if PackageKit-backend-zypp) PackageKit gnome-software ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libappstream.so.4()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnomesoftware.so.20()(64bit) libgobject-2.0.so.0()(64bit) libpackagekit-glib2.so.18()(64bit) libxmlb.so.2()(64bit) libxmlb.so.2(LIBXMLB_0.1.0)(64bit) libxmlb.so.2(LIBXMLB_0.1.1)(64bit) libxmlb.so.2(LIBXMLB_0.1.2)(64bit) libxmlb.so.2(LIBXMLB_0.1.3)(64bit) libxmlb.so.2(LIBXMLB_0.1.7)(64bit) libxmlb.so.2(LIBXMLB_0.3.1)(64bit)"

inherit rpm
