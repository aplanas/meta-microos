SUMMARY = "Graphical Boot Animation and Logger"
DESCRIPTION = "Plymouth provides an attractive graphical boot animation in \
place of the text messages that normally get shown. Text \
messages are instead redirected to a log file for viewing \
after boot."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "fdbadd645913dcf0679e598f7a82ee5763a062e72a1476986419d7297994cc2598b585193d9f5cb3a0707b9f435ed4740058314969a7076787d6f9135dfb20c0"

RPROVIDES:${PN} += "bootsplash plymouth plymouth(aarch-64) systemd-plymouth"
RDEPENDS:${PN} += "/bin/sh coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libply-splash-core.so.5()(64bit) libply.so.5()(64bit) plymouth-branding plymouth-scripts systemd"

inherit rpm
