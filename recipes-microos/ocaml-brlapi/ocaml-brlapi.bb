SUMMARY = "Library to use BRLTTY from applications -- OCaml Bindings"
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

RPM_NAME = "ocaml-brlapi-6.5-2.3.aarch64.rpm"
RPM_HASH = "57ae7f8494b97ffcf4fbec3a3551c1927a32edab7bf208427498a0cd89485bf4bab3c2c6950553ec017a3bc300862fa803b83abed1ef324ba1f4159e336ebc16"

RPROVIDES:${PN} += "ocaml-brlapi ocaml-brlapi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.17)(64bit) ocaml"

inherit rpm
