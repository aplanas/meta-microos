SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-ui-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "785933d83a69dec929d70bae5dfd5c0ad646fe8f9c66115c9de8b12f38ceece169973361f4b1f021c21c7af357b5c1e8253b62b063e585763b90b6e5b7addf5c"

RPROVIDES:${PN} += "application() application(org.gnome.Sysprof.desktop) libsysprof-ui-5.so()(64bit) metainfo() metainfo(org.gnome.Sysprof.appdata.xml) mimehandler(application/x-sysprof-capture) sysprof-ui sysprof-ui(aarch-64)"
RDEPENDS:${PN} += "/bin/sh hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgraphene-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsysprof-4.so()(64bit)"

inherit rpm
