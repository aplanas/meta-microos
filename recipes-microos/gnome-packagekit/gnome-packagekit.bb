SUMMARY = "Applications for the PackageKit API"
DESCRIPTION = "GNOME PackageKit provides session applications for the PackageKit API. \
There are several utilities designed for installing, updating and \
removing packages on your system."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-packagekit-43.0-1.3.aarch64.rpm"
RPM_HASH = "cb24504d09b0ca16380e6a8e112caf96d57be647439d307699c496d5fb2d16f716206c0cb7463f7d683864d65f3afed98713b6f838677b47f7e4f6246bf58fb2"

RPROVIDES:${PN} += "application() application(gpk-prefs.desktop) application(org.gnome.PackageUpdater.desktop) gnome-packagekit gnome-packagekit(aarch-64) metainfo() metainfo(org.gnome.PackageUpdater.metainfo.xml) opensuse-updater-gnome org.freedesktop.PackageKit.service"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpackagekit-glib2.so.18()(64bit) libpolkit-gobject-1.so.0()(64bit)"

inherit rpm
