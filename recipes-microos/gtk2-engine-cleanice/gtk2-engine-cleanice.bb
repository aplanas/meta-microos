SUMMARY = "CleanIce GTK Theme Engine"
DESCRIPTION = "Simple, clean theme engine for GTK2."
LICENSE = "GPL-2.0"

PV = "2.4.1"

RPM_NAME = "gtk2-engine-cleanice-2.4.1-19.28.aarch64.rpm"
RPM_HASH = "33f688a32a64c16969aa6a2c2b61b6b1d7c21f7547cb8eddcba34c3a166dfe6056f072128eae3b918764f445d0d9e2a8f108a8dd12e203577884d38842dd8a17"

RPROVIDES:${PN} += "gtk2-engine-cleanice gtk2-engine-cleanice(aarch-64) libcleanice.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
