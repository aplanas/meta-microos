SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "9f1cc25c76d8a48bd72a7be11a91700c6a926845ea7cb787c3a97de57b78018be0cc4967e2362cddfe59232c243f9cd490d961a96bf7adb060c96b57d8809fe2"

RPROVIDES:${PN} += "webkit2gtk3-minibrowser webkit2gtk3-minibrowser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjavascriptcoregtk-4.1.so.0()(64bit) libwebkit2gtk-4.1.so.0()(64bit)"

inherit rpm
