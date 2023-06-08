SUMMARY = "API for plexus-interactivity"
DESCRIPTION = "API module for plexus-interactivity."
LICENSE = "MIT"

PV = "1.0~alpha6"

RPM_NAME = "plexus-interactivity-api-1.0~alpha6-2.6.noarch.rpm"
RPM_HASH = "e8188f1e72bc406f547a8ab110bfd80bab5707b3202b0a79a3d5ca93df195ae21b176cf133b3f92d98d4bec8033bd3a05782368e6e23edd3e40a53022bcf3030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-interactivity-api) mvn(org.codehaus.plexus:plexus-interactivity-api:pom:) plexus-interactivity-api"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-component-api) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
