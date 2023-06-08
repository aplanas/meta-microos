SUMMARY = "Install firmware on devices"
DESCRIPTION = "This application can update, reinstall and downgrade firmware on devices \
supported by fwupd."
LICENSE = "GPL-2.0-or-later"

PV = "43.1"

RPM_NAME = "gnome-firmware-43.1-1.3.aarch64.rpm"
RPM_HASH = "2ef9c03f1989be12016a94376f114e81f588a877935d834e15a5f0897d04d9ce87760f3db175e470f8e71cd141b42debd5ab3c1fdc281a1378b277926c8c7ad2"

RPROVIDES:${PN} += "application() application(org.gnome.Firmware.desktop) gnome-firmware gnome-firmware(aarch-64) gnome-firmware-updater gnome-firmware-updater-lang metainfo() metainfo(org.gnome.Firmware.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfwupd.so.2()(64bit) libfwupd.so.2(LIBFWUPD_0.1.1)(64bit) libfwupd.so.2(LIBFWUPD_0.7.0)(64bit) libfwupd.so.2(LIBFWUPD_0.7.3)(64bit) libfwupd.so.2(LIBFWUPD_0.9.3)(64bit) libfwupd.so.2(LIBFWUPD_0.9.6)(64bit) libfwupd.so.2(LIBFWUPD_0.9.8)(64bit) libfwupd.so.2(LIBFWUPD_1.0.8)(64bit) libfwupd.so.2(LIBFWUPD_1.1.1)(64bit) libfwupd.so.2(LIBFWUPD_1.1.2)(64bit) libfwupd.so.2(LIBFWUPD_1.1.3)(64bit) libfwupd.so.2(LIBFWUPD_1.2.1)(64bit) libfwupd.so.2(LIBFWUPD_1.2.2)(64bit) libfwupd.so.2(LIBFWUPD_1.2.4)(64bit) libfwupd.so.2(LIBFWUPD_1.2.5)(64bit) libfwupd.so.2(LIBFWUPD_1.2.6)(64bit) libfwupd.so.2(LIBFWUPD_1.2.7)(64bit) libfwupd.so.2(LIBFWUPD_1.3.2)(64bit) libfwupd.so.2(LIBFWUPD_1.4.0)(64bit) libfwupd.so.2(LIBFWUPD_1.4.5)(64bit) libfwupd.so.2(LIBFWUPD_1.5.0)(64bit) libfwupd.so.2(LIBFWUPD_1.5.5)(64bit) libfwupd.so.2(LIBFWUPD_1.5.6)(64bit) libfwupd.so.2(LIBFWUPD_1.6.2)(64bit) libfwupd.so.2(LIBFWUPD_1.7.4)(64bit) libfwupd.so.2(LIBFWUPD_1.8.1)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libxmlb.so.2()(64bit) libxmlb.so.2(LIBXMLB_0.1.0)(64bit)"

inherit rpm
