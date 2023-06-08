SUMMARY = "JMods for OpenJDK 15"
DESCRIPTION = "The JMods for OpenJDK 15."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-jmods-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "475af49ab235020528055ee8b1ed5e885ac378a752ff4cb1346f68639276d0c3e0d93431e9339938a9836a24eb69c651340c9e4ca4e572a1f38c706819e6182a"

RPROVIDES:${PN} += "java-15-openjdk-jmods java-15-openjdk-jmods(aarch-64)"
RDEPENDS:${PN} += "java-15-openjdk-devel"

inherit rpm
