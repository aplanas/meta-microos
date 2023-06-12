SUMMARY = "A GTK patchbay for pipewire"
DESCRIPTION = "Helvum is a GTK-based patchbay for pipewire, inspired by the JACK tool catia."
LICENSE = "(Apache-2.0 | BSL-1.0) & GPL-3.0-only & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & ISC & MIT"

PV = "0.4.0"

RPM_NAME = "helvum-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "c0262fa86761c81494e566feee34dd6500c4eaf3793dff015d77ee084b7a557f9a5e6581757c53b1f8b5b5c94a98d9b20d820fc1623e6f9387836bac97d02923"

RPROVIDES:${PN} += "application() \
application(org.pipewire.Helvum.desktop) \
helvum \
helvum(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit)"

inherit rpm
