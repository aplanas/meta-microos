SUMMARY = "Framework for browsing and searching media content -- Tools"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides tools related to Grilo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "grilo-tools-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "c5987276c8960097271e5dd5a13426d2da9378e8f9298a6512f48cac8703aa6738d240b782603115c4e0179a03b348e781adc1275f0d1c866057f905c1e8694b"

RPROVIDES:${PN} += "grilo-tools grilo-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libgtk-3.so.0()(64bit) liboauth.so.0()(64bit)"

inherit rpm
