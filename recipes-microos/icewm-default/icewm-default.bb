SUMMARY = "Window Manager with a Taskbar -- Default Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.2"

RPM_NAME = "icewm-default-3.3.2-1.3.aarch64.rpm"
RPM_HASH = "65a67122126672d69b4458f01355e4e981a9d7e9af0a74bd149272796a3b97887d2a2aaf9d92ca4348d6e07ed82df46f9e6d1d71acb1b528d5066ad8b277f456"

RPROVIDES:${PN} += "icewm-bin icewm-default icewm-default(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl adwaita-icon-theme icewm ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libImlib2.so.1()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXpm.so.4()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfribidi.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) update-alternatives"

inherit rpm
