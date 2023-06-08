SUMMARY = "Random number generators library for Java"
DESCRIPTION = "The Uncommons Maths library provides five easy-to-use, \
statistically sound, high-performance pseudo-random \
number generators (RNGs)."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-1.2.3-1.18.noarch.rpm"
RPM_HASH = "c326cf96d556547c71ef4f8c6b635f30050f287c6cedc98613a61339020638f9c528132965e95cd606f21a3eca9854b12933f50d695cc7a527697831288c5575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.uncommons.maths:uncommons-maths) mvn(org.uncommons.maths:uncommons-maths:pom:) osgi(org.uncommons.maths) uncommons-maths"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.jfree:jcommon) mvn(org.jfree:jfreechart)"

inherit rpm
