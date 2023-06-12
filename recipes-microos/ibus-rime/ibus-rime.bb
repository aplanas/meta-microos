SUMMARY = "Rime for Linux/IBus"
DESCRIPTION = "Rime Input Method Engine for Linux/IBus"
LICENSE = "GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "ibus-rime-1.5.0-1.10.aarch64.rpm"
RPM_HASH = "2317d7ace47a7ebf562c775947602e95678c0d9243065d7ce0e6b6f1579f1bae0aa9ea5550091895f8495b1f103762cd0b4938b1566b2eca3d070c17f0bec571"

RPROVIDES:${PN} += "ibus-rime \
ibus-rime(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libnotify.so.4()(64bit) \
librime.so.1()(64bit)"

inherit rpm
