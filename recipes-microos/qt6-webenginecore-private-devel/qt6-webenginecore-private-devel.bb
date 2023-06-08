SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webenginecore-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "0dfd4074c9bf62ceee525b39901ae8b703cb9c656b9febf750e9ad819dffe4435519f4a73ef7c795a353164912a09ec7e7e733440a2c97ac046295893bdca97c"

RPROVIDES:${PN} += "qt6-webenginecore-private-devel qt6-webenginecore-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebEngineCore)"

inherit rpm
