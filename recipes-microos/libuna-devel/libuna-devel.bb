SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20220611"

RPM_NAME = "libuna-devel-20220611-4.5.aarch64.rpm"
RPM_HASH = "442fbc64ece0c4268cdc9ed47f1339553644b3106746a812aabc506572d0d66d76af5e29234f13340a5264dc2992fbf908c12d90bdca726cccd93d2152331134"

RPROVIDES:${PN} += "libuna-devel \
libuna-devel(aarch-64) \
pkgconfig(libuna)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1"

inherit rpm
