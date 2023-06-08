SUMMARY = "A text editor framework"
DESCRIPTION = "Tepl (Text Editor Product Line) is a library that eases the \
development of GtkSourceView-based text editors and IDEs. It is a \
continuation / rename of Gtef"
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "libtepl-6-2-6.4.0-1.4.aarch64.rpm"
RPM_HASH = "be98971d88b198896abc031f6188e34f8ec51d00a102de8cd86f4f4ba3f158d9fff7203e432ec15d771febe4a58803395a361d1567980312071f1a842b9852ac"

RPROVIDES:${PN} += "libtepl-6-2 libtepl-6-2(aarch-64) libtepl-6.so.2()(64bit) tepl-6"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libamtk-5.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
