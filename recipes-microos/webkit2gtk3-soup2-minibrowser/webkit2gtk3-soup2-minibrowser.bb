SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk3-soup2-minibrowser-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "df38f8ab3f569d71382e83a4e29cc3fab28e11a6f7b38e49ae22bd0a52184b0dfccbe6878c4f16c9257f307b2689ee57df5eec3ea72f6d8592b8f54d078f894b"

RPROVIDES:${PN} += "webkit2gtk3-soup2-minibrowser \
webkit2gtk3-soup2-minibrowser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjavascriptcoregtk-4.0.so.18()(64bit) \
libsoup-2.4.so.1()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
