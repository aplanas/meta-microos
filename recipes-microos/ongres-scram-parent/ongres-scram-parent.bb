SUMMARY = "Parent POM of ongres-scram"
DESCRIPTION = "This package contains the ongres-scram parent POM."
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-parent-2.1-2.10.noarch.rpm"
RPM_HASH = "a2a79e90262a640b7e62ad3b2aed593170e64d874c1bbc0f61c0e7a8fcad19795b88162a938c667546ab715167a4974f6b8b21844fb1253decfb8ef629b9bfd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.scram:parent:pom:) ongres-scram-parent"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.plugins:maven-compiler-plugin)"

inherit rpm
