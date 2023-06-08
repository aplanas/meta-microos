SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-src-17.0.7.0-1.1.aarch64.rpm"
RPM_HASH = "d5ca81ccf5d43bb87c8a2cd9e3960b02be160f527ac9d46106f2e7478325e39f03d77511961ada88e8bb9e592171af126a190f6131e575ac22edcb1b3335d7d5"

RPROVIDES:${PN} += "java-17-openjdk-src java-17-openjdk-src(aarch-64)"
RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
