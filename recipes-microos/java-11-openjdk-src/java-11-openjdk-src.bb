SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-src-11.0.19.0-1.1.aarch64.rpm"
RPM_HASH = "fe103822704f611cd6921af5dcb86ef7c1452293f7f5bd1c9bb2276026f33a6a59e1d580e35767d5f1c4f3af4ecdc6b32fd601d604ed3839df35c799fd3f5ff9"

RPROVIDES:${PN} += "java-10-openjdk-src java-11-openjdk-src java-11-openjdk-src(aarch-64)"
RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
