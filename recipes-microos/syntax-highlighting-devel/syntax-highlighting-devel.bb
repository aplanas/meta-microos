SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.105.0"

RPM_NAME = "syntax-highlighting-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7122119fbb60cd134e355a92226a8be5eb355e6a917d5ad27cf7faaab3643ccb5b5d58d43cc05e10890a159a7ca50d1a19762c2ff8e78b715850897a577618ab"

RPROVIDES:${PN} += "cmake(KF5SyntaxHighlighting) syntax-highlighting-devel syntax-highlighting-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) cmake(Qt5Gui) extra-cmake-modules libKF5SyntaxHighlighting5"

inherit rpm
