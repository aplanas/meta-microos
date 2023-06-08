SUMMARY = "Files for development with PLplot"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
PLplot can be used from within compiled languages such as C, C++, \
FORTRAN and Java, and interactively from interpreted languages such as \
Octave, Python, Perl and Tcl. \
 \
This package provides the files necessary for development with PLplot \
in C."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-devel-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "ed6d2d1927b6ce154481b4cccc85722ce340ff8aa05fa9a957322a06e6efe90d96dc0b41fe142c44320a014068565643ce8e75dd885d97a0c6e60fc0fc0da377"

RPROVIDES:${PN} += "cmake(plplot) pkgconfig(plplot) plplot plplot-devel plplot-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/pkg-config gcc-c++ ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcsirocsa0 libcsironn0 libplplot17 libqsastime0 pkgconfig pkgconfig(freetype2) plplot-common"

inherit rpm
