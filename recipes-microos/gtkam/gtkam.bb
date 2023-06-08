SUMMARY = "A GTK Digital Camera Tool"
DESCRIPTION = "GTKam is a GTK and GNOME based tool for accessing a digital camera, \
viewing thumbnails, and downloading pictures from the camera."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "gtkam-1.0-2.27.aarch64.rpm"
RPM_HASH = "1165d894d4e9d49ca0b3468e5abd295f3a650bcfb0ce5ac5290b0bf0d116ef5ab89ca069cf084ac0ead8d49c7e0829701e90155ad27da666d0e96b333d355955"

RPROVIDES:${PN} += "application() application(gtkam.desktop) gtkam gtkam(aarch-64)"
RDEPENDS:${PN} += "gtkam-lang ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexif-gtk.so.5()(64bit) libexif.so.12()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgimp-2.0.so.0()(64bit) libgimpui-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgphoto2.so.6()(64bit) libgphoto2_port.so.12()(64bit) libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
