SUMMARY = "API documentation for j2objc-annotations"
DESCRIPTION = "This package provides API documentation for j2objc-annotations."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "j2objc-annotations-javadoc-2.2-1.4.noarch.rpm"
RPM_HASH = "3f4d426539243140bd42a62d769d04fe031e7a5f1c56b880afce2c9e8e6395e03cc7285f94b7a8afba6d400590d1e0935d2573383a5dd6a05d01641956fc2c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "j2objc-annotations-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
