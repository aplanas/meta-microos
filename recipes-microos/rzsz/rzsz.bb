SUMMARY = "X-, Y-, and Z-Modem Data Transfer Protocols"
DESCRIPTION = "rzsz allows you to use 'sz filename' to send a file to your local \
system."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.21~rc"

RPM_NAME = "rzsz-0.12.21~rc-4.8.aarch64.rpm"
RPM_HASH = "d63de305010c2e583e8db139257016debc154eef03f71c2f594b23b2efa6f2780027dfc2f961b14b6475bcd149ee09897073665e56cd9cf6f061a0636dbd4aaa"

RPROVIDES:${PN} += "lrzsz \
rzsz \
rzsz(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
