SUMMARY = "Maven Plugin Java 5 Annotations"
DESCRIPTION = "This package contains Java 5 annotations to use in Mojos."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-annotations-3.6.0-5.1.noarch.rpm"
RPM_HASH = "32cc7962bf0c026820ba69b5139e031faf6c47f308e1c14e3e788aba6227a9ef0dc74336f0fad123eb5f325429a416f52239fedef450a036748a6fe6dbed49ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-annotations mvn(org.apache.maven.plugin-tools:maven-plugin-annotations) mvn(org.apache.maven.plugin-tools:maven-plugin-annotations:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven:maven-artifact)"

inherit rpm
