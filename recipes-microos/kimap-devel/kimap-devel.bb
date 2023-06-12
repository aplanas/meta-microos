SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains development headers to add IMAP support to PIM \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kimap-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "1c2e3013d59f458a8d1c6c5271463d09d5b0cb505c6a7bb0305262fc7aa613660d13d5d184495403928ceecb61263f6de1eafd506bd6104ab82abd8fe6ee43d6"

RPROVIDES:${PN} += "cmake(KF5IMAP) \
cmake(KPim5IMAP) \
kimap-devel \
kimap-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) \
cmake(KPim5Mime) \
cyrus-sasl-devel \
libKPim5IMAP5"

inherit rpm
