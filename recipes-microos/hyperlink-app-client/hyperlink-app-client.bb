SUMMARY = "Handler program for the app protocol"
DESCRIPTION = "The app protocol defines the behaviour of a terminal emulator when opening a \
'app://' hyperlink. \
 \
The behaviour is basically to send via TCP/IP the given command to the given \
hostname and port. \
 \
This behaviour can be extracted in a separate program. A terminal emulator \
can simply invoke this program, passing it the URI on standard input. This way, \
the protocol logic does not need to be hardwired into any terminal emulator. \
 \
This package contains the reference implementation of such a handler program."
LICENSE = "GPL-3.0-or-later"

PV = "0.0~git5.211516e"

RPM_NAME = "hyperlink-app-client-0.0~git5.211516e-1.2.aarch64.rpm"
RPM_HASH = "2a3951caafac0155dbc55f3a1655995d48085cc2f1eb4bb5f0c1a90d622accc340e04a44f6316418e8c44ec154a08dc11b9c94696564649ff2c7865ec33d4db3"

RPROVIDES:${PN} += "application() application(app-client.desktop) hyperlink-app-client hyperlink-app-client(aarch-64) mimehandler(x-scheme-handler/app)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
