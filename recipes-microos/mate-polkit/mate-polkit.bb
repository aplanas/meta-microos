SUMMARY = "MATE authentification agent for polkit"
DESCRIPTION = "mate-polkit provides a D-Bus session bus service that is used to bring \
up authentication dialogues used for obtaining privileges."
LICENSE = "LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-polkit-1.26.1-1.3.aarch64.rpm"
RPM_HASH = "1556b78dc8c0d0c78475c50d1a0c950de0f053776791db85d1ed743ac91ef7c4d99f2ca98b813156c9fcfebde9e99eb35a868a352ce329bc9b92899ca7cdc961"

RPROVIDES:${PN} += "mate-polkit mate-polkit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libappindicator3.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpolkit-agent-1.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit)"

inherit rpm
