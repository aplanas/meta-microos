SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-test-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "ae4149dc881ec774fbcde129676c20f2880e879a8af10b6b7bae828c1e5697a93e9c846cc714b2b3bf0d3deffe8214fd242063a8c850a5bbac9bc2a091f4f38c"

RPROVIDES:${PN} += "qt6-test-private-devel qt6-test-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Test) qt6-core-private-devel"

inherit rpm
