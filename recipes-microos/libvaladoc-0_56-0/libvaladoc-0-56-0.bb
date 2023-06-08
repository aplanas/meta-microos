SUMMARY = "Valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "libvaladoc-0_56-0-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "5d10ed345f592f863e6d15c35ac4432661d5f12f3959a095094a869e64a3d494fcaf5cbe46222b7462f932a49b3af2921f2596201bc3c5fda87a7bc4d6640e12"

RPROVIDES:${PN} += "libvaladoc-0.56.so.0()(64bit) libvaladoc-0_56-0 libvaladoc-0_56-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgvc.so.6()(64bit) libvala-0.56.so.0()(64bit) libvalaccodegen.so()(64bit)"

inherit rpm
