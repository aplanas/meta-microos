SUMMARY = "Simple PIN or Passphrase Entry Dialog for EFL"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-efl-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "a1aa6d9fbadf17bd248b6071604e5cc0b29e92ab0f0c5b417e645c97ca90c57ba7395183c235e051dc88edc928c3b96cffd6bea0e1b29f76a175d692efeb706a"

RPROVIDES:${PN} += "pinentry-dialog pinentry-efl pinentry-efl(aarch-64) pinentry-gui pinentry:/usr/bin/pinentry-efl"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libassuan.so.0()(64bit) libassuan.so.0(LIBASSUAN_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecore.so.1()(64bit) libecore_x.so.1()(64bit) libelementary.so.1()(64bit) libevas.so.1()(64bit) libglib-2.0.so.0()(64bit) libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libsecret-1.so.0()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) pinentry"

inherit rpm
