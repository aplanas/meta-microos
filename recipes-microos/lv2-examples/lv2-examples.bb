SUMMARY = "LV2 example plugins"
DESCRIPTION = "LV2 is a plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a core (roughly \
equivalent in power to LADSPA) which can be extended to support more \
functionality. \
This package contains LV2 example plugins."
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-examples-1.18.10-2.1.aarch64.rpm"
RPM_HASH = "0ae41983e2dfe2bea7f5dcf9315140486f245fd93ee322689ceca8114f4e84dce2e27372e7becadb1813d2192d550f405428cc0f63f65b49c5b159f864d78749"

RPROVIDES:${PN} += "lv2-examples lv2-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) lv2"

inherit rpm
