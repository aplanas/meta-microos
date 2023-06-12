SUMMARY = "Library to handle pty/tty and utmp/wtmp/lastlog"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty0-2.0-2.7.aarch64.rpm"
RPM_HASH = "f3e0356f5dfdf3c69e0180dbcbe3427421138a665e298f5118e15396f1bd91fc25cc3f7f9e5c3714ffee14577fdebb32c07b672b0038f3e3fa713f3616c9878f"

RPROVIDES:${PN} += "libptytty.so.0()(64bit) \
libptytty0 \
libptytty0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
