SUMMARY = "Maven Common Artifact Filters"
DESCRIPTION = "A collection of ready-made filters to control inclusion/exclusion of artifacts \
during dependency resolution."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-common-artifact-filters-3.0.1-2.12.noarch.rpm"
RPM_HASH = "582e81b2892945028422a8db5e3f6eaf72892ad7bae630d318ff412fe9c69488a7af43d925a694dc7da1ddfafd32e7668df7e2b65fbec19f85aa73b0598ee074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters mvn(org.apache.maven.shared:maven-common-artifact-filters) mvn(org.apache.maven.shared:maven-common-artifact-filters:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-model) mvn(org.apache.maven:maven-plugin-api)"

inherit rpm
