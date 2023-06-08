SUMMARY = "Development files for libqgpgmeqt6, a Qt library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 6 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgmeqt6-devel-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "83ef97ce27842cf9f28df9be01d2daee297d097bda02a8d008158a9fa9915f44fb13e8116e19d9baf6b09eaa5319d5aac4ac3952b671f26a34c53a89a422478c"

RPROVIDES:${PN} += "cmake(QGpgmeQt6) libqgpgmeqt6-devel libqgpgmeqt6-devel(aarch-64)"
RDEPENDS:${PN} += "libgpgme-devel libgpgmepp-devel libqgpgmeqt6-15"

inherit rpm
