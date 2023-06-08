SUMMARY = "Library to use BRLTTY from applications -- Tcl Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "tcl-brlapi-6.5-2.3.aarch64.rpm"
RPM_HASH = "f7c847af3be7d1e4448cdc7fb44d6fe6033af96cf4211fe7481b00cd5e1d86edd46cd4dd6cb6a65228b2c1d7e512e0d39b2b1e141b2c1cc9700c31713343db86"

RPROVIDES:${PN} += "libbrlapi_tcl.so.0.8()(64bit) tcl-brlapi tcl-brlapi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) tcl"

inherit rpm
