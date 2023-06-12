SUMMARY = "Framework for browsing and searching media content -- Tools"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides tools related to Grilo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-tools-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "89021079b3638ea1fb3a9b8521559128204ffd779d30360c190cc0b2c14a74685eb40426ed22cf03eb99a904d02568ee63568a775af226c8d17fbf93fddbd92e"

RPROVIDES:${PN} += "grilo-tools grilo-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libgtk-3.so.0()(64bit) liboauth.so.0()(64bit)"

inherit rpm
