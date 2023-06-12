SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "jsch-javadoc-0.2.9-1.1.noarch.rpm"
RPM_HASH = "a9fb05e33bb7efc6e57c303636775c09b6ca495be2874d885183ddab3d2a83a0698d86c5782c4aea335b1da216d02d4e29e8d244ea167aa0319cdb5f71aa167d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
