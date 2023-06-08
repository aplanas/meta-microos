SUMMARY = "Apache Maven parent POM"
DESCRIPTION = "Apache Maven parent POM file used by other Maven projects."
LICENSE = "Apache-2.0"

PV = "27"

RPM_NAME = "maven-parent-27-1.11.noarch.rpm"
RPM_HASH = "189bebce73e12bc9fccab159a23ec0fb33ed49fc11d3b0e7694dd6355ce67252ad87beb5134bbbfa3e2c74370c5ca72c8966fcffa9fd580887720047c21dd0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-parent mvn(org.apache.maven:maven-parent:pom:)"
RDEPENDS:${PN} += "apache-parent java-headless javapackages-filesystem"

inherit rpm
