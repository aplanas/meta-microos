SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-core-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "b60bb3942459cdf5a0be20df76b86af5345f6203cc421ab577db137929e241ba69f0adabd8128ec0372817c631b71f41d06fded83949ac81a32ded1609c1246b"

RPROVIDES:${PN} += "qt6-core-private-devel qt6-core-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core)"

inherit rpm
