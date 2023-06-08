SUMMARY = "Javadoc for jakarta-activation"
DESCRIPTION = "This package contains javadoc for jakarta-activation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "jakarta-activation-javadoc-2.1.0-2.6.noarch.rpm"
RPM_HASH = "2089ee8f74f5f1bdce96d8df8bef152ab428a599056d1b5d153a49d5ccf271e8412c7648b5ca3d332086ed9903e58ef9b973595279f6c7555e800912bc4dae26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-activation-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
