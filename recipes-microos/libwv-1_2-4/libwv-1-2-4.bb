SUMMARY = "Library for importing Microsoft Word documents"
DESCRIPTION = "libwv can parse the Microsoft Word 8 binary file format (Office97)."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "libwv-1_2-4-1.2.9-2.9.aarch64.rpm"
RPM_HASH = "cb63328f6f26fbd2168e04e91f5373f89c74f6d41b03451ad37e5af689275ba3f51ecfad432f3799aab2ed3b211ba8d231342cd6d8fbf9e0cef69716b9ce3a8f"

RPROVIDES:${PN} += "libwv-1.2.so.4()(64bit) libwv-1_2-4 libwv-1_2-4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsf-1.so.114()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
