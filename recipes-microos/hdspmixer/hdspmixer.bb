SUMMARY = "GUI tool to control advanced routing of RME Hammerfall DSP cards"
DESCRIPTION = "HDSPMixer is the Linux equivalent of the Totalmix application from RME. \
It is a tool to control the advanced routing features of the RME \
Hammerfall DSP soundcard series."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "hdspmixer-1.11-24.3.aarch64.rpm"
RPM_HASH = "6de9aab92c4bf59ea8f30bc85890d8cdd3433f56c95480a6d517dee5d07795cf4fde2e077f8ef0662d872c09ee413ea19ce5d2a1bf7d55ab8e558ee7a34fd8cf"

RPROVIDES:${PN} += "alsa-tools-gui:/usr/bin/hdspmixer application() application(hdspmixer.desktop) hdspmixer hdspmixer(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfltk.so.1.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
