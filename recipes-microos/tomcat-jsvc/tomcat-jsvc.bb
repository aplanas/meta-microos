SUMMARY = "Apache jsvc wrapper for Apache Tomcat as separate service"
DESCRIPTION = "Systemd service and wrapper scripts to start tomcat with jsvc, \
which allows tomcat to perform some privileged operations \
(e.g. bind to a port < 1024) and then switch identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-jsvc-9.0.75-1.1.noarch.rpm"
RPM_HASH = "a1e85d9c0ce747aef709f00c3551240459c3e73227bc5e3f27c1fbf160884fc4fc3330c05ecf5556a2368559152b45ba5c4009c03ad3ce76eaac7752ed776a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-jsvc"
RDEPENDS:${PN} += "/bin/sh apache-commons-daemon-jsvc tomcat"

inherit rpm
