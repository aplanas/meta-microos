SUMMARY = "Motif Include Files and Libraries Mandatory for Development"
DESCRIPTION = "This package provies the include files and libraries necessary for developing \
Motif applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "motif-devel-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "7773fad359335b49470e1b8c9210096503b4eaef10f78683d59f88d66326e99554a8ead1258ec1eaee5edfa089eda92923a5a0c1fed147f1fa2e13f12ab882ba"

RPROVIDES:${PN} += "motif-devel motif-devel(aarch-64) openmotif-devel"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMrm.so.4()(64bit) libMrm4 libUil4 libXm.so.4()(64bit) libXm4 libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) pkgconfig(printproto) pkgconfig(x11) pkgconfig(xft) pkgconfig(xproto) pkgconfig(xt)"

inherit rpm
