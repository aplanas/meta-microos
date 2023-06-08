SUMMARY = "Textmode WINdow environment"
DESCRIPTION = "Twin is a text-mode window environment. It supports mouse and multiple \
windows, has a built-in terminal emulator and window manager, and can \
serve as display for client applications. Its retro look-and-feel comes \
with very modern features: it is best described as a VNC-like server, \
that can use a variety of displays - all with mouse support: from a \
plain text terminal, to a Linux console, to a full kde, gnome or X11 \
desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "twin-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "b666c9a098c2392163449c1ac739ba832e274287ac4899af5cfea1046ae98252632ad9ade76e9d1f544ea4e9af96ae1c2fd94db0e0586c74e30563aa0fcafc02"

RPROVIDES:${PN} += "libhw_X11-0.9.1.so()(64bit) libhw_display-0.9.1.so()(64bit) libhw_tty-0.9.1.so()(64bit) libhw_twin-0.9.1.so()(64bit) libhw_xft-0.9.1.so()(64bit) librcparse-0.9.1.so()(64bit) libsocket-0.9.1.so()(64bit) libterm-0.9.1.so()(64bit) libwm-0.9.1.so()(64bit) twin twin(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/true ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXft.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libgpm.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtstl.so.1()(64bit) libtutf.so.1()(64bit) libtw.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
