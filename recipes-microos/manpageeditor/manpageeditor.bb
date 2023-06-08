SUMMARY = "A simple manual pages editor"
DESCRIPTION = "Create, edit, import, preview man-pages."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "manpageeditor-0.1.3-1.9.aarch64.rpm"
RPM_HASH = "b3e764bac4264785beacfcde8d3e9da4cc8c1d8aa2ed1c7be849c8fc13e6d9ce5447a0cf100cc7b862feb2e3fe317408674febaef5718a6ada28c158bfb46bed"

RPROVIDES:${PN} += "application() application(ManPageEditor.desktop) manpageeditor manpageeditor(aarch-64) mimehandler(application/x-maneditdoc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaspell.so.15()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-3.0.so.1()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
