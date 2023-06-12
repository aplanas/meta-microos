SUMMARY = "Development files for the X Input Extension library"
DESCRIPTION = "libXi is the client-side library for the X Input Extension. \
 \
This package contains the development headers for the library found \
in libXi6."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "libXi-devel-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "7731735b16bd0e282d7344f08b82b31d05909d908de487f94c2ff29450994fe15b64ec90b64e2b9d133d6d17a1dde0c649ed861b450f90b0e0c13658abf6bbd3"

RPROVIDES:${PN} += "libXi-devel \
libXi-devel(aarch-64) \
libXi6-devel \
pkgconfig(xi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXi6 \
pkgconfig(inputproto) \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xfixes)"

inherit rpm
