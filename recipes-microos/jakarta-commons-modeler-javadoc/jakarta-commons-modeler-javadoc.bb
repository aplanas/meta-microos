SUMMARY = "Javadoc for jakarta-commons-modeler"
DESCRIPTION = "The Modeler project shall create and maintain a set of Java classes to \
provide the facilities described in the preceeding section, plus unit \
tests and small examples of using these facilities to instrument Java \
classes with Model MBean support. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Modeler Package."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-commons-modeler-javadoc-2.0.1-2.6.noarch.rpm"
RPM_HASH = "a83ee8d038883c31ff6194fae70fe676c2f852cc2eccce563c826902248f7c923d89b712091db721a9684c6555f6ed24510a3dff315fa1a51b8fb65f88eed6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-modeler-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
