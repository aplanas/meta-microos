SUMMARY = "Helper utilities to control QMI devices"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol. \
 \
This package contains command line tools to manage such devices."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "libqmi-tools-1.32.4-1.1.aarch64.rpm"
RPM_HASH = "da742e59b38a5fc9a8c0576c71c147fd52ee5c0c7dc11b202494a6f2e104bcdb4be8d3f1c6c0113b7193b3b1fbac4bcb2bee96260f8a46875bba46100e565eb9"

RPROVIDES:${PN} += "libqmi-tools libqmi-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgudev-1.0.so.0()(64bit) libmbim-glib.so.4()(64bit) libqmi-glib.so.5()(64bit) libqrtr-glib.so.0()(64bit)"

inherit rpm
