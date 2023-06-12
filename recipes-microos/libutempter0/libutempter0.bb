SUMMARY = "Shared library of utempter"
DESCRIPTION = "Utempter is a privileged helper for utmp and wtmp updates.  This \
package contains the library used by applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libutempter0-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "b93d82a7017784a379c0fdf725017c30df7e2749100525bb3eb4e3a3af646fe763a142ec42ed30e408c9763fed88f5d70f34f22d8be2ceace9f5dc1c60c78159"

RPROVIDES:${PN} += "libutempter.so.0()(64bit) \
libutempter.so.0(UTEMPTER_1.1)(64bit) \
libutempter0 \
libutempter0(aarch-64) \
utempter"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
group(utmp) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
permissions"

inherit rpm
