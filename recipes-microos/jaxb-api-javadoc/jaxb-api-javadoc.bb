SUMMARY = "API documentation for jaxb-api"
DESCRIPTION = "API documentation for jaxb-api."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "jaxb-api-javadoc-4.0.0-2.5.noarch.rpm"
RPM_HASH = "9e724af53281d99a444d24e93cc690a100e5a84d0b977b22c0e55a01711a68dfdac466e7f7caad054a1a5553b2d8b22abae47790149f264a532bd7a5541fcbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxb-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
