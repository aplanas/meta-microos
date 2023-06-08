SUMMARY = "OpenJDK 13 API Documentation"
DESCRIPTION = "The OpenJDK 13 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-javadoc-13.0.14.0-2.3.noarch.rpm"
RPM_HASH = "5e01efe85c88a08a57377268366904bb50d86dbed7924ece6ebe98f21e06bea0e286bc03c6306af99e0ed7b1d321675b8eed7e7f036c59a169749f731de04566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-13-javadoc java-13-openjdk-javadoc java-javadoc"
RDEPENDS:${PN} += "/bin/sh jpackage-utils update-alternatives"

inherit rpm
