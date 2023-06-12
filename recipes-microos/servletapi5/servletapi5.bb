SUMMARY = "Java servlet and JSP implementation classes"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet)."
LICENSE = "Apache-2.0"

PV = "5.0.18"

RPM_NAME = "servletapi5-5.0.18-288.6.noarch.rpm"
RPM_HASH = "7df262a4cf6958e3ccfeb37907cfb0f476daecd96b0a3261f7f7664c391d9f1655666ef53dbe69a435049852ed4a7c0fb78546d5260b3e2b772ece6d44e2a5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servlet \
servlet24 \
servlet5 \
servletapi5"
RDEPENDS:${PN} += "/bin/sh \
update-alternatives"

inherit rpm
