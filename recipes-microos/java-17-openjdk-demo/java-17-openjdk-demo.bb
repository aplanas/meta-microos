SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-demo-17.0.7.0-1.1.aarch64.rpm"
RPM_HASH = "07aa69f205fd5f4dd8d395c47f24a0ce6d8932099bb8cce93f83440416bd351992e6c55e95b106c1d8b0ae9e6e566c4587bff0cbbdfc0dedef211692d347b39d"

RPROVIDES:${PN} += "java-17-openjdk-demo java-17-openjdk-demo(aarch-64)"
RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
