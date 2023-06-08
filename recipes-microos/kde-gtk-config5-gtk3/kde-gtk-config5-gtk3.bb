SUMMARY = "GTK3 Preview Helper for the GTK Configuration"
DESCRIPTION = "This package contains a helper application that allows previewing \
the GTK3 application style from within the application style KCM"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "kde-gtk-config5-gtk3-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "87f7f096324b616f3829a1bb60ef0a08bbc48f16daf70d70ac3223467a98b6dfd4922a17f5b23827a586ad79a0622196ebec49c8399c6bf2072fcadcdb19b9c1"

RPROVIDES:${PN} += "kde-gtk-config5-gtk3 kde-gtk-config5-gtk3(aarch-64)"
RDEPENDS:${PN} += "kde-gtk-config5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
