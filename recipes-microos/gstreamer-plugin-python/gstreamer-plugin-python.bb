SUMMARY = "GStreamer 1.0 plugin for python"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugin-python-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "9cb3aeb4fe9196223f1a4609064342fc4837e677e8a241632dc3c27329ae3edb88f89480de4c9409d9b7a025c2b9c63ddfbc35918256f30d4bff79bf7b5b7392"

RPROVIDES:${PN} += "gstreamer-plugin-python gstreamer-plugin-python(aarch-64) libgstpython.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpython3.10.so.1.0()(64bit)"

inherit rpm
