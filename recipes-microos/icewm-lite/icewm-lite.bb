SUMMARY = "Window Manager with a Taskbar -- Lite Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.2"

RPM_NAME = "icewm-lite-3.3.2-1.3.aarch64.rpm"
RPM_HASH = "0cd7714b488c5c67290166f92f76ca57e4603dedc46039090429b952e728d535c80641629a67df489b2aadb1670750d7738bbb00a8289cb9613aee25bfacdbb5"

RPROVIDES:${PN} += "icewm-bin icewm-lite icewm-lite(aarch-64)"
RDEPENDS:${PN} += "/bin/sh icewm ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libImlib2.so.1()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXpm.so.4()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) update-alternatives"

inherit rpm
