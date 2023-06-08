SUMMARY = "Sisu Plexus"
DESCRIPTION = "This package contains Sisu Plexus."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-plexus-0.3.5-3.5.noarch.rpm"
RPM_HASH = "1c0a8817e3678d05bbc84754b78f85ddf14cd38cb0a3901f030e742b7b4be7ddb1a8ce7c1c35494e4cb41b4f6dae56b0fc0a8d326737fbeca3e7fc72470cfbac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.eclipse.sisu:org.eclipse.sisu.plexus) mvn(org.eclipse.sisu:org.eclipse.sisu.plexus:pom:) mvn(org.sonatype.sisu:sisu-inject-plexus) mvn(org.sonatype.sisu:sisu-inject-plexus:pom:) sisu-plexus"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-classworlds) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-utils) mvn(org.eclipse.sisu:org.eclipse.sisu.inject)"

inherit rpm
