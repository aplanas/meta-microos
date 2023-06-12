SUMMARY = "Python bindings for the GTK+ widget set"
DESCRIPTION = "PyGTK is an extension module for python that gives you access to the \
GTK+ widget set.  Just about anything you can write in C with GTK+ you \
can write in python with PyGTK (within reason), but with all of \
python's benefits."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.0"

RPM_NAME = "python-gtk-2.24.0-22.8.aarch64.rpm"
RPM_HASH = "2b6affaea934e34ccf77caa5daebb28befe48966183a42a9502c0b95814292420ffa0cd3a5596440e3141cfc791a437e47bfd31acc94108e74e4ebead145c7bc"

RPROVIDES:${PN} += "pygtk2 \
python-gtk \
python-gtk(aarch-64) \
python2-gtk"
RDEPENDS:${PN} += "atk \
glib2 \
gtk2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglade-2.0.so.0()(64bit) \
libglade2 \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
pango \
python(abi) \
python-cairo \
python-gobject2"

inherit rpm
