SUMMARY = "Generator for API documentation from Vala source"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "valadoc-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "2c120cebc72cef5bfd9f3f8ab87e0ca2ec9f90355cf3512fe795ec934c908aa0906d460376c145374d8282e15bf7bb819c243e2ec5e6c2877195f573bfbee3d2"

RPROVIDES:${PN} += "valadoc valadoc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libvala-0.56.so.0()(64bit) libvalaccodegen.so()(64bit) libvaladoc-0.56.so.0()(64bit)"

inherit rpm
