SUMMARY = "API documentation for jetty-version-maven-plugin"
DESCRIPTION = "API documentation for jetty-version-maven-plugin."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.0.10"

RPM_NAME = "jetty-version-maven-plugin-javadoc-1.0.10-2.9.noarch.rpm"
RPM_HASH = "db6f105ebe63f6e9dd8553c34719f2e5003821b7a85fa3acb2131b1c0415e3bb78d2c78f4d9770bd541bdadb3089d2f8bcce7110f8fafd09844bae188505ea1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-version-maven-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
