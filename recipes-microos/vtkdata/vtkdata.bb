SUMMARY = "Kitware VTK Library Data"
DESCRIPTION = "The Visualization ToolKit (VTK) is an open source, freely available \
software system for 3D computer graphics, image processing, and \
visualization used by thousands of researchers and developers around \
the world. \
 \
This package contains some example data for the Toolkit."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtkdata-9.2.6-1.1.noarch.rpm"
RPM_HASH = "d42dfe957324cf1981862f6e9ceeb7796240b2067f00f40179d7077ba976641c34b1c785002d0e413e9e94ef7582796229115803bbfd00ded3b0728e23617d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vtkdata vtklargedata"
RDEPENDS:${PN} += ""

inherit rpm
