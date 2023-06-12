SUMMARY = "PulseAudio Volume Meter"
DESCRIPTION = "PulseAudio Volume Meter (pavumeter) is a simple GTK volume meter for \
the PulseAudio sound server."
LICENSE = "GPL-2.0+"

PV = "0.9.3"

RPM_NAME = "pavumeter-0.9.3-195.30.aarch64.rpm"
RPM_HASH = "be901ca359150fa70522de93cb3a2edcd3596c569a17b49ad4b879fef38bc4cba25f7528a353f8b02459812986fd8d998e6032be2d356c697d175d4630156c13"

RPROVIDES:${PN} += "application() \
application(pavumeter-record.desktop) \
application(pavumeter.desktop) \
pavumeter \
pavumeter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdkmm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkmm-2.4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
