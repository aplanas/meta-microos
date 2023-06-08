SUMMARY = "Apache jsvc wrapper for Apache Tomcat as separate service"
DESCRIPTION = "Systemd service and wrapper scripts to start tomcat with jsvc, \
which allows tomcat to perform some privileged operations \
(e.g. bind to a port < 1024) and then switch identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-jsvc-9.0.43-16.1.noarch.rpm"
RPM_HASH = "97ad6d267f4168981d6352408ef030f08dc4a5fecd07f0b40c2d6492780ae14671fdd5fa84e2c3bdc7ba88fa02be60968dfd94d1e794382475dfee365e497b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-jsvc"
RDEPENDS:${PN} += "/bin/sh apache-commons-daemon-jsvc tomcat"

inherit rpm
