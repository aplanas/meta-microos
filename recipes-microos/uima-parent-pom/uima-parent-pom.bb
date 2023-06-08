SUMMARY = "Apache UIMA Parent POM"
DESCRIPTION = "UIMA (Unstructured Information Management Architecture). \
UIMA promotes community development and reuse of annotators \
that extract meta-data from unstructured information (text, \
audio, video, etc.); it provides for externalized declaration of \
type systems, component configuration, aggregation, and more, \
supports scalablity, and provides tooling. \
 \
This package provides Parent for Apache UIMA Projects."
LICENSE = "Apache-2.0"

PV = "10"

RPM_NAME = "uima-parent-pom-10-1.18.noarch.rpm"
RPM_HASH = "467e114dde7af67c76be9e62a259fc49564648b607906b3374de6c01d3cd5e3329f8524dca925d02b81ddaf866970b29788d375401c192c124dcda5ee816dad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.uima:parent-pom:pom:) uima-parent-pom"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.plugins:maven-antrun-plugin) mvn(org.apache.maven.plugins:maven-enforcer-plugin) mvn(org.apache:apache:pom:) mvn(org.codehaus.mojo:build-helper-maven-plugin)"

inherit rpm
