SUMMARY = "Development files for librcd, a charset detection library"
DESCRIPTION = "librcd is a library for automatic encoding detection of \
Russian/Ukrainian language texts. It is optimized for very small \
words and phrases. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librcd."
LICENSE = "LGPL-2.1+"

PV = "0.1.14"

RPM_NAME = "librcd-devel-0.1.14-4.26.aarch64.rpm"
RPM_HASH = "512c2d2425aa6993043b30ca60a88be95cc3c6f595a544b01bfe2f349c7f588c5fac882e51249362d9c48f6dca997e5e5413a8a07431d5c9159e71b833633cd3"

RPROVIDES:${PN} += "librcd-devel \
librcd-devel(aarch-64) \
pkgconfig(librcd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
librcd0"

inherit rpm
