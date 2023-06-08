SUMMARY = "Cyrus SASL plugin for using Google's XOAUTH"
DESCRIPTION = "This package provides a Cyrus SASL plugin to use Google's XOAUTH authentication \
for receiving and sending mail through Google servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "sasl2-kdexoauth2-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9aad01d689c10d8e4a88b45d11857bbf53708ba88d5c6a24abb1750f6c253fd4b52aa6eb1c8e8a5bdb9496f91a924c59a6e585c21a7e63e2ea0f6760e7be65ac"

RPROVIDES:${PN} += "libkdexoauth2.so.3()(64bit) sasl2-kdexoauth2 sasl2-kdexoauth2(aarch-64) sasl2-kdexoauth2-3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
