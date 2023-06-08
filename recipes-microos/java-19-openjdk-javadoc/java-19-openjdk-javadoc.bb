SUMMARY = "OpenJDK 19 API Documentation"
DESCRIPTION = "The OpenJDK 19 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "19.0.2.0"

RPM_NAME = "java-19-openjdk-javadoc-19.0.2.0-3.3.noarch.rpm"
RPM_HASH = "756d54af9594d291fa43bf6b798be0e4b0a771125bd9cfbaf743fb6f874a456f38345cf3c04b12c6a874a79e02582e0f1066c8557e830fbf1bc1348a33ce9a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-19-javadoc java-19-openjdk-javadoc java-javadoc"
RDEPENDS:${PN} += "/bin/sh jpackage-utils update-alternatives"

inherit rpm
