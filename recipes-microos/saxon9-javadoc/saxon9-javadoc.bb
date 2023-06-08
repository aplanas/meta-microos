SUMMARY = "Javadoc for saxon9"
DESCRIPTION = "Javadoc for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-javadoc-9.4.0.7-16.6.noarch.rpm"
RPM_HASH = "69e5004062497b2f0339fd8cc3b43f30c336991e154a4be65f32d095a4131957c148a7081471190491915994aeeaa0a6d989efe24084c07e5aa984da720c3974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
