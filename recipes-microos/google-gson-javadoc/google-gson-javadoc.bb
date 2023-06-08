SUMMARY = "API documentation for google-gson"
DESCRIPTION = "This package contains the API documentation for google-gson."
LICENSE = "Apache-2.0"

PV = "2.8.9"

RPM_NAME = "google-gson-javadoc-2.8.9-4.8.noarch.rpm"
RPM_HASH = "261e14f755457524e9c7b7bcc9226e7c4ac2a9dd21ec02712acf2ac11abb12897bc8526747df62c22ae25c6a779390633735597e06afc6e0756928442edfbc92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
