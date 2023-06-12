SUMMARY = "Devel package for python39-poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained. \
 \
This package contains the SIP and Qscintilla API files to build \
python packages using python-poppler"
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python39-poppler-qt5-devel-21.3.0-1.12.aarch64.rpm"
RPM_HASH = "53075f3a27998f60f5e49da8ddda8078e6594b27e067d4f446d4b4541c965f3d92cc66cbfe380c04185a840dcf5d12da94cbad6790866f49edbf658fe4c87e99"

RPROVIDES:${PN} += "python39-poppler-qt5-devel \
python39-poppler-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "libpoppler-qt5-devel \
python39-qt5-devel \
python39-sip-devel"

inherit rpm
