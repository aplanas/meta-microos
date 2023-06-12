SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-3.48.0-2.1.aarch64.rpm"
RPM_HASH = "e0d6ddd4187167f4a719af4120db896e239a261053c514f6b95333e286166dbce036bd640e3e2421143e344bddfe4420ab47419b3387acc2ce888aae3599e68d"

RPROVIDES:${PN} += "libsysprof-4.so()(64bit) \
libsysprof-memory-4.so()(64bit) \
libsysprof-speedtrack-4.so()(64bit) \
sysprof \
sysprof(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libunwind.so.8()(64bit)"

inherit rpm
