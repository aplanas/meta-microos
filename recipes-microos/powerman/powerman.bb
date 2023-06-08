SUMMARY = "Centralized Power Control for Clusters"
DESCRIPTION = "PowerMan is a tool for manipulating remote power control (RPC) devices from a \
central location. Several RPC varieties are supported natively by PowerMan and \
Expect-like configurability simplifies the addition of new devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.26"

RPM_NAME = "powerman-2.3.26-4.3.aarch64.rpm"
RPM_HASH = "63c330c58110f972e80e5e7a4af55aae084e7d5d36fef9478b8dc869f11aaf04eb6a7148101392928013e3218a8fd13f41868dae26f98caf23fb6b738c1dbbae"

RPROVIDES:${PN} += "config(powerman) group(powerman) powerman powerman(aarch-64) user(powerman)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libnetsnmp.so.40()(64bit) libwrap.so.0()(64bit) shadow systemd"

inherit rpm
