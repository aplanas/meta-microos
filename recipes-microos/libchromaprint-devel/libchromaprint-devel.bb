SUMMARY = "Audio Fingerprinting Library"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.1"

RPM_NAME = "libchromaprint-devel-1.5.1-4.1.aarch64.rpm"
RPM_HASH = "656e510b921ac1ba12ca87da59c752ea7bdebc868949789cd7f310227baef593b48dd9dd6273bde29bd91ee0ae6ef7584bde34a7cf3286705ef15847255c5b80"

RPROVIDES:${PN} += "libchromaprint-devel \
libchromaprint-devel(aarch-64) \
pkgconfig(libchromaprint)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
fftw3-devel \
libchromaprint1 \
libtag-devel"

inherit rpm
