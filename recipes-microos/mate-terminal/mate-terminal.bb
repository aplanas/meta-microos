SUMMARY = "MATE Desktop terminal emulator"
DESCRIPTION = "MATE Terminal is a terminal emulation application that you can use \
to perform the following actions: \
 * Access a UNIX shell in the MATE environment. \
 * Run any application that is designed to run on VT102, VT220, and \
   xterm terminals."
LICENSE = "GPL-3.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-terminal-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "9b550633914d14b502c59e0380c83da19a31e499819188e26649e69bc16e1a6b4b24e422dbb1a0468b8f43d62ebcecd1f642506823b103e87d3cb55506fe9a20"

RPROVIDES:${PN} += "application() application(mate-terminal.desktop) mate-terminal mate-terminal(aarch-64) metainfo() metainfo(mate-terminal.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/perl gsettings-backend-dconf ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdconf.so.1()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libvte-2.91.so.0()(64bit)"

inherit rpm
