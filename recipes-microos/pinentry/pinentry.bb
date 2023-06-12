SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "This is a collection of simple PIN or passphrase entry dialogs which \
utilize the Assuan protocol as described by the Aegypten project."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "e7bb391f59cfa69a77c58e1b330a23f32409f1540a533070fbe399072d66ada17126d7cda10acded32ec3ae56212aa9d80b564de79b717db1ea30434e263afed"

RPROVIDES:${PN} += "pinentry \
pinentry(aarch-64) \
pinentry-dialog"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libassuan.so.0()(64bit) \
libassuan.so.0(LIBASSUAN_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
