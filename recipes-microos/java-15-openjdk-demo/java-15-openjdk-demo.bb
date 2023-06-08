SUMMARY = "OpenJDK 15 Demos"
DESCRIPTION = "The OpenJDK 15 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-demo-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "08c79c94b17e149fffc7654438dd3cedbd42d4e97a3fb3ae365312e594b3385e2ddfaf87519bd766c5b628605afa0492c2849cb5b7cb8313d0a5711562ba43eb"

RPROVIDES:${PN} += "java-15-openjdk-demo java-15-openjdk-demo(aarch-64)"
RDEPENDS:${PN} += "java-15-openjdk"

inherit rpm
