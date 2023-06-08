SUMMARY = "Inews - Post News from an NNTP Client"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "mininews-2.6.5-1.6.aarch64.rpm"
RPM_HASH = "211ba3c0c914d58cc1b59e0ab4f3101e2374ba3465338ce3fb6f2bcbb419afc2801107342c72c45e997452dd429f7d124246c4a841a02449aa8de7782e752078"

RPROVIDES:${PN} += "config(mininews) mininews mininews(aarch-64) nntp_daemon"
RDEPENDS:${PN} += "/bin/sh group(news) group(uucp) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) permissions user(news)"

inherit rpm
