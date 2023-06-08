SUMMARY = "Qt 6 Quick3DSpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DSpatialAudio private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dspatialaudio-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "533579444e2b60c8a216eed63a496f07126f1afbb158b9be546d7f98550c602eaccbdd4e17588fc5945ea2d7a5a0131b0b694eb8279fe17346490eaf9b2fa067"

RPROVIDES:${PN} += "cmake(Qt6Quick3DSpatialAudioPrivate) qt6-quick3dspatialaudio-private-devel qt6-quick3dspatialaudio-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick) libQt6Quick3DSpatialAudio6 qt6-multimedia-private-devel"

inherit rpm
