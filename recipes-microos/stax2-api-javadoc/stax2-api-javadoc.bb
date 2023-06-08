SUMMARY = "API documentation for stax2-api"
DESCRIPTION = "This package contains the API documentation for stax2-api."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "stax2-api-javadoc-4.0.0-3.10.noarch.rpm"
RPM_HASH = "09a2024ae7fc28b02dfe4800e3e739ab2fc73cef94a91301e987867ffed17f685eae548b89ed5802cd424b01c5416139f0086c9debf3217ff93b713bdbd5ffcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax2-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
