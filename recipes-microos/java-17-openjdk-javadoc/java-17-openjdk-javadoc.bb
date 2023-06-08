SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-javadoc-17.0.7.0-1.1.noarch.rpm"
RPM_HASH = "42b0e4b8bcde8a7a1444013c60b5224ecb63b2406f9f22c4cb02222ea95ce4328ff5e1d4a1484d4b94b01ade45ae5e469a82630813d6d7c26666e5168413b4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc java-17-openjdk-javadoc java-javadoc"
RDEPENDS:${PN} += "/bin/sh jpackage-utils update-alternatives"

inherit rpm
