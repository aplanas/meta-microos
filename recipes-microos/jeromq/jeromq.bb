SUMMARY = "Pure Java implementation of libzmq"
DESCRIPTION = "Pure Java implementation of libzmq."
LICENSE = "MPL-2.0+"

PV = "0.5.2"

RPM_NAME = "jeromq-0.5.2-1.7.noarch.rpm"
RPM_HASH = "c27d572d4fb46bf69db03346ca79a1b0caac49488d1c29e360a05c646f3b2b3609bc43cab020f4d6e1bb4cb5162345da93d1f5b9e62982a64f176c9e15725ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq \
mvn(org.zeromq:jeromq) \
mvn(org.zeromq:jeromq:pom:) \
osgi(org.zeromq.jeromq)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(eu.neilalexander:jnacl)"

inherit rpm
