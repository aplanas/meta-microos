SUMMARY = "Non-ABI stable API for the Qt 6 SpatialAudio Library"
DESCRIPTION = "This package provides private headers of libQt6SpatialAudio that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-spatialaudio-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "649aedde095551354b09ce995cda7ef9c5640e36d5a551c389967790033e910b064001f1e15f031bfc48f2d3f4f774669fb241baa4f173065f7c97ebbf61c7e3"

RPROVIDES:${PN} += "qt6-spatialaudio-private-devel qt6-spatialaudio-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6SpatialAudio)"

inherit rpm
