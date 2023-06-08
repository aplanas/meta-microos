SUMMARY = "Graphics application for digital painters"
DESCRIPTION = "MyPaint is a graphics application for digital painters. It supports \
graphics tablets made by Wacom, and many similar devices. The \
standard brushes can emulate traditional media like charcoal, \
pencils, ink, or paint."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "mypaint-2.0.1-3.14.aarch64.rpm"
RPM_HASH = "d4683b025688552e6b62f057bcebf0105977dbbffefdf14f33f45c50509e9cbc7ea6abc87c076079958d97e866880ec4dea149aa28cdac759712107e427c12ec"

RPROVIDES:${PN} += "application() application(mypaint.desktop) metainfo() metainfo(mypaint.appdata.xml) mimehandler(image/jpeg) mimehandler(image/openraster) mimehandler(image/png) mypaint mypaint(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmypaint.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) mypaint-brushes python3-gobject-Gdk python3-numpy python3-pycairo typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(PangoCairo)"

inherit rpm
