SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-test-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e091deb60a9fcaae1e72bcede82e549de492be26d6da93cc1e41588a1e44ce76c838926e344a330b8ec13b86c3382eaa986f1ce4d100258a64d20bf6e9e67c4d"

RPROVIDES:${PN} += "qt6-test-private-devel qt6-test-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Test) qt6-core-private-devel"

inherit rpm
