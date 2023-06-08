SUMMARY = "error-prone type annotations"
DESCRIPTION = "Google Error Prone type annotations"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-type_annotations-2.11.0-2.1.noarch.rpm"
RPM_HASH = "af01e40e5bd86ff6536b3323d9c9b1d7cbea736ff38187a814cd3a07ec3ccbdc007a1a924aab8a03d8c53e33bf721497e3bebae18b534f157210564000721fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-type_annotations mvn(com.google.errorprone:error_prone_type_annotations) mvn(com.google.errorprone:error_prone_type_annotations:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
