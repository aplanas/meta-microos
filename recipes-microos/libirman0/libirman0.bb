SUMMARY = "Library for irman access"
DESCRIPTION = "libirman is a general purpose library for programs to use in order to \
receive infrared signals via irman-compatible hardware."
LICENSE = "LGPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "libirman0-0.5.2-5.12.aarch64.rpm"
RPM_HASH = "a5919e78abe781d92ebdbd279f405a949dc5d836297cd586fdde20a3421e654fba1c9887de3ed06d22dafa04faba20576c036d79af7a69fe95d516fa7e31ad91"

RPROVIDES:${PN} += "libirman.so.0()(64bit) \
libirman0 \
libirman0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libirman-common"

inherit rpm
