SUMMARY = "Javadoc for jackson-modules-base"
DESCRIPTION = "This package contains API documentation for jackson-modules-base."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-modules-base-javadoc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "18eec62f9995b5393ef98a38aabb2ce3f12d724421c0a5a3afb9692cebe6a28990c73afa02a271811230e0f9ae64d845e32fa54af879fe56e61b9818593faa45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
