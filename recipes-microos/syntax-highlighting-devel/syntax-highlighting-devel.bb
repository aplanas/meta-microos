SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.106.0"

RPM_NAME = "syntax-highlighting-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "77391d45f6428aeef8804bd151f7d1ef251819725dd6b283b971cfc5b0c2b239747a16d66d11097300666eab9e93dd3599cc939e2526b0a357f0f771b7a1d436"

RPROVIDES:${PN} += "cmake(KF5SyntaxHighlighting) \
syntax-highlighting-devel \
syntax-highlighting-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
cmake(Qt5Gui) \
extra-cmake-modules \
libKF5SyntaxHighlighting5"

inherit rpm
