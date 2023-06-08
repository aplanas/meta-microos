SUMMARY = "Shared library for Budgie theming"
DESCRIPTION = "Budgie theming engine shared library package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "libbudgietheme0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "0f8d768ce42280960e169c1e221c3864f6738264e181763679563c9275e83c43ef46276432c614083bd64a22d920ae794a27a700c86eeae55074d3df2c0e2a7c"

RPROVIDES:${PN} += "libbudgietheme.so.0()(64bit) libbudgietheme0 libbudgietheme0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
