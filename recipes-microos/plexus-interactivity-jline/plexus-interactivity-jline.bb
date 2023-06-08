SUMMARY = "jline module for plexus-interactivity"
DESCRIPTION = "jline module for plexus-interactivity."
LICENSE = "MIT"

PV = "1.0~alpha6"

RPM_NAME = "plexus-interactivity-jline-1.0~alpha6-2.6.noarch.rpm"
RPM_HASH = "c8e5d536c83d47ccddfd50351696f7af7012d91411d71d0f32bdffec22092810c3b0518497a440d37ef627128847e334e29d9d529411cd2c1712aec45aa2ebd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-interactivity-jline) mvn(org.codehaus.plexus:plexus-interactivity-jline:pom:) plexus-interactivity-jline"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(jline:jline) mvn(org.codehaus.plexus:plexus-interactivity-api) plexus-interactivity-api"

inherit rpm
