SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-jmods-17.0.7.0-1.1.aarch64.rpm"
RPM_HASH = "68086bd26e24ef6ff728890369057938280dced695b77c60cecfe37f45550848d6d01d26d751b03534b7abbdd0b484ce2a70051ff84c7de5fa2b9f5751aa20ad"

RPROVIDES:${PN} += "java-17-openjdk-jmods java-17-openjdk-jmods(aarch-64)"
RDEPENDS:${PN} += "java-17-openjdk-devel"

inherit rpm
