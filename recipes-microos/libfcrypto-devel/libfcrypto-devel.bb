SUMMARY = "Development files for libfcrypto"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfcrypto."
LICENSE = "LGPL-3.0-or-later"

PV = "20221229"

RPM_NAME = "libfcrypto-devel-20221229-1.2.aarch64.rpm"
RPM_HASH = "11acf5a32ca9d87167ab8acfd3ca16eb3da56a295ea776167d98a8092cefb121c14352eb52d5eefd9b76f4323c21a347d3cfa41a1ac88ac8d077795e3e0d386b"

RPROVIDES:${PN} += "libfcrypto-devel libfcrypto-devel(aarch-64) pkgconfig(libfcrypto)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfcrypto1"

inherit rpm
