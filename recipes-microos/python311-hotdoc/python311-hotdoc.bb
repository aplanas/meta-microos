SUMMARY = "A documentation tool micro-framework"
DESCRIPTION = "Hotdoc is a documentation framework. It provides an interface for extensions \
to plug upon, along with some base objects (formatters, ...) \
 \
Hotdoc is distributed with a set of extensions that perform various tasks, \
such as parsing C and extracting symbols with clang, parsing \
gobject-introspection (gir) files, highlighting the syntax of code snippets \
with prism, etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.13.3"

RPM_NAME = "python311-hotdoc-0.13.3-1.17.aarch64.rpm"
RPM_HASH = "a7aa886853b040800ac945abe59470bca1df47127a29a3916c51200e4d9775d2a29bf43c2a2cd78ab10519684774ba6b87c90f220e6bec379af0c1af4d8c8a92"

RPROVIDES:${PN} += "python3.11dist(hotdoc) python311-hotdoc python311-hotdoc(aarch-64) python3dist(hotdoc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 /usr/bin/sh clang-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) llvm-devel python(abi) python311-PyYAML python311-appdirs python311-cchardet python311-dbus-deviation python311-lxml python311-networkx python311-pkgconfig python311-schema python311-setuptools python311-toposort python311-wheezy.template"

inherit rpm
