SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "This package provides private headers of libQt6LabsQmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "5dba327be3c04d84e4987995b178b65569c486e2ce24dc8b5c195faee71ea0311e9ebf0b7cd5ef7f0ed804c83b2e0e8263a890b27260ca2d102ba304c69001b4"

RPROVIDES:${PN} += "qt6-labsqmlmodels-private-devel qt6-labsqmlmodels-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsQmlModels)"

inherit rpm
