SUMMARY = "Header files for the libdca library"
DESCRIPTION = "libdca is a free library for decoding DTS Coherent Acoustics \
streams. It is released under the terms of the GPL license. The DTS \
Coherent Acoustics standard is used in a variety of applications, \
including DVD, DTS audio CD and radio broadcasting. \
 \
This package contains header files and static library for the \
libdca library. Install this package if you want to compile \
programs using the library."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7+2"

RPM_NAME = "libdca-devel-0.0.7+2-1.2.aarch64.rpm"
RPM_HASH = "0d46b7c41c9fbb31dc2f799a4542ac6a6a1eb57e16380e2f69cdf3bfaa1006d4a743b6d7023b4f10ec9630a8190b1f762a68258b225688db693f589f448db7f6"

RPROVIDES:${PN} += "libdca-devel \
libdca-devel(aarch-64) \
pkgconfig(libdca) \
pkgconfig(libdts)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdca0"

inherit rpm
