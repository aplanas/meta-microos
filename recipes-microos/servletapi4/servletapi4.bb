SUMMARY = "Java servlet and JSP implementation classes"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet)."
LICENSE = "Apache-1.1"

PV = "4.0.4"

RPM_NAME = "servletapi4-4.0.4-300.6.noarch.rpm"
RPM_HASH = "439a8620772c668bc2eeefe265492337aa41959823d30e1a7bc2339798fe25b56be36f1a947815d1ad003f6f969eacd6324ee45324a5a2b99108acefaaecbbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servlet servlet22 servlet4 servletapi4"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/update-alternatives"

inherit rpm
