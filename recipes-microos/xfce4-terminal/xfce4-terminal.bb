SUMMARY = "Terminal Emulator for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-terminal is a lightweight and easy to use terminal emulator for the Xfce \
desktop environment. Its major features include a simple configuration \
interface, the ability to use multiple tabs with terminals within a single \
window, the possibility to have a pseudo-transparent terminal background, and a \
compact mode where both the menubar and the window decorations are hidden which \
helps to save space on the desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "xfce4-terminal-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "f2dc2befc497adadcc05bb02433da57617bfd2138301d01961f6cfbf7148847dd607afb6bc52afd61ac22e60ad2066d4a4215b1979ed2020ad20128de4ca1117"

RPROVIDES:${PN} += "application() \
application(xfce4-terminal-settings.desktop) \
application(xfce4-terminal.desktop) \
xfce4-terminal \
xfce4-terminal(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libutempter.so.0()(64bit) \
libutempter.so.0(UTEMPTER_1.1)(64bit) \
libvte-2.91.so.0()(64bit) \
libxfce4kbd-private-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
