SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "0533f302b9915c37dba4dbeffad2f0b9526c92c424fc2ff7fd3def1a73f157338285eb7d906e036d119a1729e7319af078d16ca3a7f6a2428c0ed4cf7e3057cf"

RPROVIDES:${PN} += "webkit2gtk3-minibrowser webkit2gtk3-minibrowser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjavascriptcoregtk-4.1.so.0()(64bit) libwebkit2gtk-4.1.so.0()(64bit)"

inherit rpm
