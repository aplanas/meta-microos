SUMMARY = "Javadoc for glassfish-annotation-api"
DESCRIPTION = "This package contains javadoc for glassfish-annotation-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.3.2"

RPM_NAME = "glassfish-annotation-api-javadoc-1.3.2-3.6.noarch.rpm"
RPM_HASH = "23d547e7eb7a57aa7e23787ad48d8e6012deaaf46e48a43ce3460a93046aa568ccb383998d3ac72c583293af64ab33b8aba1bb5c767eaffc44e689c5e7b372d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-annotation-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
