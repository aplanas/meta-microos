SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.105.0"

RPM_NAME = "kdoctools-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "a3d3c0480a9d18a253ed5a2b68ee7b34709b29ff2187217e847470660630b23b2ac0e555ad8a0c565a724268c463c0ebdcd35b486b06464b670340b3edcc8ec1"

RPROVIDES:${PN} += "cmake(KF5DocTools) kdoctools-devel kdoctools-devel(aarch-64) kdoctools-devel-static"
RDEPENDS:${PN} += "cmake(Qt5Core) docbook-xsl-stylesheets extra-cmake-modules kdoctools libKF5DocTools5 libxslt-devel"

inherit rpm
