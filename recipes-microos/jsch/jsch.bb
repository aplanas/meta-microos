SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "jsch-0.2.9-1.1.noarch.rpm"
RPM_HASH = "6a71cddc4d1ae2c807b6b2a8fef9e7bb85b42f5688f0011b13b91de5829fc0d4a3404e9cf2c97bb2946ed3aae21c82fa326c24c072f491f6cc7d41dc3bd40d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch \
mvn(com.github.mwiede:jsch) \
mvn(com.github.mwiede:jsch:pom:) \
mvn(com.jcraft:jsch) \
mvn(com.jcraft:jsch:pom:) \
osgi(com.jcraft.jsch)"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
