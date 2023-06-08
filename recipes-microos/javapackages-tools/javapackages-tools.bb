SUMMARY = "Macros and scripts for Java packaging support"
DESCRIPTION = "This package provides macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-tools-6.1.0-2.2.aarch64.rpm"
RPM_HASH = "4c3af936cbb242bae54b1f75672cfed68ca859de1204bcdd673f7f8159f8f8d1c0825cace5e41f349e293ee641bf2bb75dd480f2bac3e78169a2a03e9b70014d"

RPROVIDES:${PN} += "config(javapackages-tools) javapackages-tools javapackages-tools(aarch-64) jpackage-utils mvn(com.sun:tools) mvn(sun.jdk:jconsole) rpm_macro(ant) rpm_macro(jar) rpm_macro(java) rpm_macro(java_home) rpm_macro(javac) rpm_macro(javadoc) rpm_macro(jpackage_script)"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
