SUMMARY = "A KDE Software for Music Education"
DESCRIPTION = "Application for Music Education. \
 \
Minuet aims at supporting students and teachers in many aspects \
of music education, such as ear training, first-sight reading, \
solfa, scales, rhythm, harmony, and improvisation. \
Minuet makes extensive use of MIDI capabilities to provide a \
full-fledged set of features regarding volume, tempo, and pitch \
changes, which makes Minuet a valuable tool for both novice and \
experienced musicians."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "minuet-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b3cb48e09e7c199e8f1d843e26143c6fe8e7136e5b4f4828a9b809253e3029e463183cd3b068167fb27c9d39ed00971fcf238913511de2aa2fce910457eb0f46"

RPROVIDES:${PN} += "application() application(org.kde.minuet.desktop) libminuetinterfaces.so.0.3.0()(64bit) metainfo() metainfo(org.kde.minuet.appdata.xml) minuet minuet(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfluidsynth.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
