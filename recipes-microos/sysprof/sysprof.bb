SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "6da84fa9b99066284602d1ce7808c981cff72fbc3e463f0c16e23a6306670e9d812e03e4e56903785d905dc50a5866fba7167caaf1875afba351366039e34dd9"

RPROVIDES:${PN} += "libsysprof-4.so()(64bit) libsysprof-memory-4.so()(64bit) libsysprof-speedtrack-4.so()(64bit) sysprof sysprof(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpolkit-agent-1.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libunwind.so.8()(64bit)"

inherit rpm
