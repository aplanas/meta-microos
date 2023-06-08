SUMMARY = "Documentation and examples for OpenCV"
DESCRIPTION = "This package contains the documentation and examples for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.18"

RPM_NAME = "opencv3-doc-3.4.18-2.5.aarch64.rpm"
RPM_HASH = "8a3cb335ed644cbf5d4b06e16abbd774318307219ca6de3e5fb17e7715c02410d7e65541a7cce1448adc092c6abeae5398a918b37da9db3ddc1228e0b5770574"

RPROVIDES:${PN} += "opencv-qt5-doc opencv3-doc opencv3-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
