SUMMARY = "Disks application for dealing with storage devices"
DESCRIPTION = "The gnome-disk-utility project provides the Disks application for \
dealing with storage devices."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-disk-utility-44.0-1.1.aarch64.rpm"
RPM_HASH = "9c1ce16b9e105b687f8eda963f64337fdc212ab0b0ba728031c805bc204b54dec7feb5d49e8991c173479b4e2b8d185971dff216a32de4b0672336aa00d745e4"

RPROVIDES:${PN} += "application() application(gnome-disk-image-mounter.desktop) application(gnome-disk-image-writer.desktop) application(org.gnome.DiskUtility.desktop) gnome-disk-utility gnome-disk-utility(aarch-64) metainfo() metainfo(org.gnome.DiskUtility.appdata.xml) mimehandler(application/x-cd-image) mimehandler(application/x-raw-disk-image) mimehandler(application/x-raw-disk-image-xz-compressed)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libdvdread.so.8()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpwquality.so.1()(64bit) libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) libsecret-1.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudisks2.so.0()(64bit) udisks2"

inherit rpm
