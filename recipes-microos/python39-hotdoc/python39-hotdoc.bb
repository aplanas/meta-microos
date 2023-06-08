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

RPM_NAME = "python39-hotdoc-0.13.3-1.17.aarch64.rpm"
RPM_HASH = "49d5da1d8385d1c5c333cc0f05be940c0c29bc99c598ac2cb7d964084fd911789dbf93a8a578c58e19d6eddb7384b4a01abdeae81516f6380601c6935d47b702"

RPROVIDES:${PN} += "python3.9dist(hotdoc) python39-hotdoc python39-hotdoc(aarch-64) python3dist(hotdoc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 /usr/bin/sh clang-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) llvm-devel python(abi) python39-PyYAML python39-appdirs python39-cchardet python39-dbus-deviation python39-lxml python39-networkx python39-pkgconfig python39-schema python39-setuptools python39-toposort python39-wheezy.template"

inherit rpm
