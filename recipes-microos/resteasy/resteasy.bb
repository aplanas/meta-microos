SUMMARY = "Framework for RESTful Web services and Java applications"
DESCRIPTION = " \
 \
 \
 \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-3.0.26-3.10.noarch.rpm"
RPM_HASH = "83c7eb43d37a62f7115ea8a30408a893234fc7fcb243bff6215a7c7dca9bdac2cb6862a59db216a10be095cf0314b992befaff0b764233fcd076c9a5690529ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "resteasy"
RDEPENDS:${PN} += "resteasy-atom-provider resteasy-client resteasy-core resteasy-jackson2-provider resteasy-jaxb-provider"

inherit rpm
