SUMMARY = "Javadoc for servletapi4"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet). This package \
contains the javadoc documentation for the Java Servlet and JSP APIs."
LICENSE = "Apache-1.1"

PV = "4.0.4"

RPM_NAME = "servletapi4-javadoc-4.0.4-300.6.noarch.rpm"
RPM_HASH = "faf3ff0c6d77836713c20b53c6c41035b0d312f648a1db42a0df9a0f270d0348e9dca195100cbaf074d44fc3e8784283f771660bc186b1511adb3789a9171593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servletapi4-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
