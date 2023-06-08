SUMMARY = "Two-way braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. New \
languages can be added through tables that support a rule- or \
dictionary-based approach. Math braille (Nemeth and Marburg) is \
supported."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis20-3.25.0-1.1.aarch64.rpm"
RPM_HASH = "34458701ed1f9207b593156cfbd8a4ce2c6937c9a166a9b5be56bebd0feffe5e9b9f84bf722e742ed84e1cfb3224dc809719f8ef4ff22ac5b78974e9c2c391c0"

RPROVIDES:${PN} += "liblouis liblouis.so.20()(64bit) liblouis20 liblouis20(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) liblouis-data"

inherit rpm
