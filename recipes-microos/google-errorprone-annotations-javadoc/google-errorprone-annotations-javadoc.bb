SUMMARY = "Javadoc for google-errorprone-annotations"
DESCRIPTION = "This package contains the API documentation for google-errorprone-annotations."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-annotations-javadoc-2.11.0-2.1.noarch.rpm"
RPM_HASH = "27fd9baf09f665e250378f97ad9c09ad21e8302e0148f3cae0f5c42e1b57f892f0d10aa79ba8409f03d590b7ccf171df021df7deb0e10f7e7d4e294b4879ee4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotations-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
