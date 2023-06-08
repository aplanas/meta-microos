SUMMARY = "Graphical User Interface to Control JACK Servers"
DESCRIPTION = "JACK Audio Connection Kit - Qt GUI Interface: A simple Qt application \
to control the JACK server. Written in C++ around the Qt4 toolkit \
for X11, most exclusively using Qt Designer. Provides a simple GUI \
dialog for setting several JACK server parameters, which are properly \
saved between sessions, and a way control of the status of the audio \
server. With time, this primordial interface has become richer by \
including a enhanced patchbay and connection control features."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qjackctl-0.9.10-1.1.aarch64.rpm"
RPM_HASH = "0feb1f6026467190f41d8651257f676eb5e8876eaf77037576b5de116b04dd80a10176e7c3eb78887179da6256e28476ab5cc6f6a3e06d3809da2cc6f9a0dd94"

RPROVIDES:${PN} += "application() application(org.rncbc.qjackctl.desktop) metainfo() metainfo(org.rncbc.qjackctl.metainfo.xml) qjackctl qjackctl(aarch-64)"
RDEPENDS:${PN} += "(jack or pipewire-libjack-0_3) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libportaudio.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
