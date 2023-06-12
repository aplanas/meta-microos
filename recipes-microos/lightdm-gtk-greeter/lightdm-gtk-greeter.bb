SUMMARY = "Simple display manager (GTK+ greeter)"
DESCRIPTION = "A LightDM greeter that uses the GTK+ toolkit. \
This is the reference implementation of a LightDM greeter based on the Gtk \
toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-2.0.8-1.12.aarch64.rpm"
RPM_HASH = "2d799f64559623fb9d541284d01afa119e9133d28bc02e15764430562534756b50039f6f7d41cbae31c34b176c4310004439ab6fd673f32a492adca5801f4986"

RPROVIDES:${PN} += "lightdm-greeter \
lightdm-gtk-greeter \
lightdm-gtk-greeter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblightdm-gobject-1.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
lightdm \
lightdm-gtk-greeter-branding \
update-alternatives"

inherit rpm
