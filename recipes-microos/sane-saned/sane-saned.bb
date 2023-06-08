SUMMARY = "Sane network server"
DESCRIPTION = "Saned allows access to locally attached scanners over the network."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "sane-saned-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "cdd9157226f13409bd027f2a1378a217042a7064c29caed5bb1e8fbdbaea8eb9d9bfa677b7a69aee8600af281198f82fae4dd48898d6355b1591f56777d2b7f5"

RPROVIDES:${PN} += "config(sane-saned) sane-backends:/usr/sbin/saned sane-saned sane-saned(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libsane.so.1()(64bit)"

inherit rpm
