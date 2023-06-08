SUMMARY = "API documentation for itextpdf"
DESCRIPTION = "This package contains the API documentation for itextpdf."
LICENSE = "AGPL-3.0-only"

PV = "5.5.13.3"

RPM_NAME = "itextpdf-javadoc-5.5.13.3-1.10.noarch.rpm"
RPM_HASH = "6b246a526dc9a5e40746b761018c5c0cd6305a911462741029e0e29bf749e44b65b22cd6bfe66127785471c3a69481eeb1faa83ed8b9867d7ea930b3c838066b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itextpdf-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
