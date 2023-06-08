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

RPM_NAME = "python310-hotdoc-0.13.3-1.17.aarch64.rpm"
RPM_HASH = "765f44b28369a9f66ecd8091fef630d490c7d8297e41c89b8b3cf758ffe4dc4502ed6b71d051350047d1cf9cee9a57633ba0c9f196ce19d586c9e156a263dadd"

RPROVIDES:${PN} += "hotdoc python3-hotdoc python3.10dist(hotdoc) python310-hotdoc python310-hotdoc(aarch-64) python3dist(hotdoc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 /usr/bin/sh clang-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) llvm-devel python(abi) python310-PyYAML python310-appdirs python310-cchardet python310-dbus-deviation python310-lxml python310-networkx python310-pkgconfig python310-schema python310-setuptools python310-toposort python310-wheezy.template"

inherit rpm
