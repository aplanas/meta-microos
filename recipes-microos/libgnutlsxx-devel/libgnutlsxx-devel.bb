SUMMARY = "Development package for the GnuTLS C++ API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutlsxx-devel-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "e9329fce50870370c91cdaaebb9c8b82fa7a90d373b1e2858b4886ceb0ce44dc21f4c3f195b1c90cb94d52e0f4cf47987c33322c016d09b57142aaf3513b44df"

RPROVIDES:${PN} += "libgnutlsxx-devel \
libgnutlsxx-devel(aarch-64)"
RDEPENDS:${PN} += "libgnutls-devel \
libgnutlsxx30 \
libstdc++-devel"

inherit rpm
