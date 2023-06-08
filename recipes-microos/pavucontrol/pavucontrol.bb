SUMMARY = "PulseAudio Volume Control"
DESCRIPTION = "PulseAudio Volume Control (pavucontrol) is a simple GTK based volume \
control tool ('mixer') for the PulseAudio sound server. In contrast to \
classic mixer tools this one allows you to control both the volume of \
hardware devices and of each playback stream separately."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "pavucontrol-5.0-1.9.aarch64.rpm"
RPM_HASH = "969821875c6c06fd4f1ddc324110f786b37f71f2dd2e1367ccfbcd7e54003fa27ffa5686ae3554b12873bb4bc4d5e658c7571e87bdd1f3b2ce40ad3fc6e6dd57"

RPROVIDES:${PN} += "application() application(pavucontrol.desktop) pavucontrol pavucontrol(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatkmm-1.6.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdkmm-3.0.so.1()(64bit) libgiomm-2.4.so.1()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.4.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtkmm-3.0.so.1()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpulse-mainloop-glib.so.0()(64bit) libpulse-mainloop-glib.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsigc-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) pulseaudio-daemon"

inherit rpm
