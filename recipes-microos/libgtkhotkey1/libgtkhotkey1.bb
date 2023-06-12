SUMMARY = "Platform Independent Hotkey Handling for GTK+ Applications"
DESCRIPTION = "GtkHotkey is simple library offering a platform independent way for GTK+ \
applications to manage and bind desktop-wide hotkeys."
LICENSE = "LGPL-3.0+"

PV = "0.2.1"

RPM_NAME = "libgtkhotkey1-0.2.1-16.27.aarch64.rpm"
RPM_HASH = "21d57b3793839846edfb41b318e094fcdcf1a3996a587684f7060bba2c425c3c5265f5ef43fb13e240e37576be99e212249e8321c2167240f9dddf2bf8ebcce1"

RPROVIDES:${PN} += "libgtkhotkey.so.1()(64bit) \
libgtkhotkey1 \
libgtkhotkey1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
