SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-demo-11.0.19.0-1.1.aarch64.rpm"
RPM_HASH = "28a50a2ee0fba77d203b73db99ebcb0ac240c007835d17bd81b6d7d5846fb718a9c5fad41157228000ff8f71cd57ebfe9d76ccbd7ad1f7857d021ab7509b9cc2"

RPROVIDES:${PN} += "java-10-openjdk-demo \
java-11-openjdk-demo \
java-11-openjdk-demo(aarch-64)"
RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
