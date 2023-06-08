SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-core-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "66f14ad59c848e68c12c063cd46a65e35319359e2e59e2df53c23cdf0074a3758c7f15d0c8efa55b92b2ba2aee4c3283ff176134a7ede6350cf1c35faa8432fc"

RPROVIDES:${PN} += "cmake(Qt6Core) cmake(Qt6CoreTools) pkgconfig(Qt6Core) qt6-core-devel qt6-core-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6Core6 pkgconfig(Qt6Platform) qt6-base-common-devel"

inherit rpm
