SUMMARY = "J2ObjC Annotations"
DESCRIPTION = "A set of annotations that provide additional information to \
the J2ObjC translator to modify the result of translation."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "j2objc-annotations-2.2-1.4.noarch.rpm"
RPM_HASH = "ca0df55466b9b1cbc46d32f18aadec3b0f5ddacd9f6e797dd845a56b93b318307f9b210abfd542180846717bb70bcba8771f921b55f878ab1c5391f8cb0780a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "j2objc-annotations mvn(com.google.j2objc:j2objc-annotations) mvn(com.google.j2objc:j2objc-annotations:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
