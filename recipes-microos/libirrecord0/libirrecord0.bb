SUMMARY = "LIRC record library"
DESCRIPTION = "The LIRC record library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "libirrecord0-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "9df003bb30fc8ae672704e5650cec9bcee1a83fd8edbc73de151e69dc6083c10d6d7da33f5e3cfa14e7a42ad1a3bdbd48f49fb4f758f0396c624dc3052a5bca0"

RPROVIDES:${PN} += "libirrecord.so.0()(64bit) libirrecord0 libirrecord0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblirc.so.0()(64bit)"

inherit rpm
