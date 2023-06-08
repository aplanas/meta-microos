SUMMARY = "JMods for OpenJDK 18"
DESCRIPTION = "The JMods for OpenJDK 18."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-jmods-18.0.2.0-4.3.aarch64.rpm"
RPM_HASH = "40b5fe77252a7eac79d2eec10e9cb4b036ee102f7203c05b825fc3ce8944ec24fb05e89ca1c3d07481a4ebd01f7f98afec48c5c2bb0bb7bc2f15a6fbb59da0aa"

RPROVIDES:${PN} += "java-18-openjdk-jmods java-18-openjdk-jmods(aarch-64)"
RDEPENDS:${PN} += "java-18-openjdk-devel"

inherit rpm
