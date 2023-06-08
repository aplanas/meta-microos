SUMMARY = "Plexus Component API"
DESCRIPTION = "Plexus Component API"
LICENSE = "Apache-2.0"

PV = "1.0~alpha15"

RPM_NAME = "plexus-component-api-1.0~alpha15-2.6.noarch.rpm"
RPM_HASH = "78fbb1843bf447d0156c7c47f5db161575b86d08590ec3596cb95a8ec1594f154259f3db91fe10fd915b9b155ed8648c9c48332025e06ccf80948a184094cbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-component-api) mvn(org.codehaus.plexus:plexus-component-api:pom:) plexus-component-api"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-classworlds)"

inherit rpm
