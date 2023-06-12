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

RPM_NAME = "tcl-brlapi-6.5-2.4.aarch64.rpm"
RPM_HASH = "cfd75cb1b20218876b8b6d6e9f6b6739b15729ae5a5dff9cda14e4bbb4aaf7519236fb61df4e41995126569ff81322ae0cac6202970689095a436921f11ed81a"

RPROVIDES:${PN} += "libbrlapi_tcl.so.0.8()(64bit) tcl-brlapi tcl-brlapi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) tcl"

inherit rpm
