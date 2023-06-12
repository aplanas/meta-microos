SUMMARY = "OpenJDK 19 Source Bundle"
DESCRIPTION = "The OpenJDK 19 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "19.0.2.0"

RPM_NAME = "java-19-openjdk-src-19.0.2.0-3.3.aarch64.rpm"
RPM_HASH = "e510493611d733d9c237c3248564c08915fc6f869de890ec8535018e62ec42c377a5caf7bc3f689c2bdd776d237c4ca85584d591d3a7508cff5908685fbc3b5e"

RPROVIDES:${PN} += "java-19-openjdk-src \
java-19-openjdk-src(aarch-64)"
RDEPENDS:${PN} += "java-19-openjdk"

inherit rpm
