SUMMARY = "GNOME Text Editor"
DESCRIPTION = "Text Editor is a simple text editor that focus on session \
management. It works hard to keep track of changes and state even \
if you quit the application. You can come back to your work even if \
you've never saved it to a file."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-text-editor-44.0-1.1.aarch64.rpm"
RPM_HASH = "c3bf5366406f9539ecb9434465f29d9498aca7371946b83fd9a76a8dfade6001d04f4fc5b5cf5c6f0fb89e9d289baf48152003ab3543673e8eab1ff1fc9fda55"

RPROVIDES:${PN} += "application() application(org.gnome.TextEditor.desktop) gnome-text-editor gnome-text-editor(aarch-64) metainfo() metainfo(org.gnome.TextEditor.appdata.xml) mimehandler(application/x-zerosize) mimehandler(text/plain)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libeditorconfig.so.0()(64bit) libenchant-2.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libgtksourceview-5.so.0()(64bit) libicuuc.so.72()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
