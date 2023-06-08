SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.1.55"

RPM_NAME = "jsch-0.1.55-2.6.noarch.rpm"
RPM_HASH = "9dc1d5c8ee3ebd230ed81e172ed9dc0c6e83758cca74ddfae3e38011f47e59d6951caf39428869da015a1ae18227f80373955c0726534ba76e026647a8348c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch mvn(com.jcraft:jsch) mvn(com.jcraft:jsch:pom:) osgi(com.jcraft.jsch)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem jzlib"

inherit rpm
