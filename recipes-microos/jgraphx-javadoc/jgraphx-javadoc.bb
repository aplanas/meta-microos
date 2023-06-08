SUMMARY = "API documentation for jgraphx"
DESCRIPTION = "API documentation for jgraphx."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "jgraphx-javadoc-4.2.2-2.5.noarch.rpm"
RPM_HASH = "482bfb44f1dde7d1e4b7d087cc2594878a13de39a51a65a93d25b52d8d8810f418d7252d1fd26b0e50422c168ab3be91c90a404794bce003ace039757cb10ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgraphx-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
