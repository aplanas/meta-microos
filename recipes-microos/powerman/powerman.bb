SUMMARY = "Centralized Power Control for Clusters"
DESCRIPTION = "PowerMan is a tool for manipulating remote power control (RPC) devices from a \
central location. Several RPC varieties are supported natively by PowerMan and \
Expect-like configurability simplifies the addition of new devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.27"

RPM_NAME = "powerman-2.3.27-1.1.aarch64.rpm"
RPM_HASH = "aa44944fbf7f7271a5030e69169b2631b1a99ce24f1c244032cdfddb7c2e725ac804d1f1b9ab984f3e59f3217cc4a6ddc8fb91ec7fe786466b98a8cbbb8c21ac"

RPROVIDES:${PN} += "config(powerman) group(powerman) powerman powerman(aarch-64) user(powerman)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libnetsnmp.so.40()(64bit) libwrap.so.0()(64bit) shadow systemd"

inherit rpm
