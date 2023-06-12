SUMMARY = "Time Zone Descriptions"
DESCRIPTION = "These are configuration files that describe available time zones - this \
package is intended for Java Virtual Machine based on OpenJDK."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2023c"

RPM_NAME = "timezone-java-2023c-1.1.noarch.rpm"
RPM_HASH = "c7abc2bd6b0c2ffbe30656e945ab0b73412199617522e9658dba847d811adda3a0ce506e96d354e523298ddfc084a39a9d550031c8158e4eaa7dc49382aca25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timezone-java \
tzdata-java \
tzdata-java8"
RDEPENDS:${PN} += "coreutils \
filesystem"

inherit rpm
