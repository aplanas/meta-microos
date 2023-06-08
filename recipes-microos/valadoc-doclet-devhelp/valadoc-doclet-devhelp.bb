SUMMARY = "Devhelp plugin for the valadoc generator"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "valadoc-doclet-devhelp-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "f6419af965ffa18a6b60e6fc2d46095248f9392ebe49a0b7cce62658f300716da32b16244f6c8a70533fa6a80903f0d658ad69bafbc78a9af9eba056b483f8b6"

RPROVIDES:${PN} += "libdoclet.so()(64bit) valadoc-doclet-devhelp valadoc-doclet-devhelp(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libvala-0.56.so.0()(64bit) libvaladoc-0.56.so.0()(64bit)"

inherit rpm
