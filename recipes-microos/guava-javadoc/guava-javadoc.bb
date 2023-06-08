SUMMARY = "Javadoc for guava"
DESCRIPTION = "API documentation for guava."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "31.1"

RPM_NAME = "guava-javadoc-31.1-2.4.noarch.rpm"
RPM_HASH = "4b669d61ba3d80c805aad5fe994e517d4b427ddb0ab5856202e573a7aebc2ad0e934bd34b06efd68c2c2b6ab264d0f68f8631f469b19e3826e4bada57653a6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
