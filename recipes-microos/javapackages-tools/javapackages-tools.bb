SUMMARY = "Macros and scripts for Java packaging support"
DESCRIPTION = "This package provides macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-tools-6.1.0-3.1.aarch64.rpm"
RPM_HASH = "4a0b76424c6fea560fe402c892acf3686f765c52d765fe82199a521bf5c0337e825db423f5d1d8c6b78a95ba7ce326e85b3d6b088e76551d5959d4f347c7c77e"

RPROVIDES:${PN} += "config(javapackages-tools) \
javapackages-tools \
javapackages-tools(aarch-64) \
jpackage-utils \
mvn(com.sun:tools) \
mvn(sun.jdk:jconsole) \
rpm_macro(ant) \
rpm_macro(jar) \
rpm_macro(java) \
rpm_macro(java_home) \
rpm_macro(javac) \
rpm_macro(javadoc) \
rpm_macro(jpackage_script)"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
