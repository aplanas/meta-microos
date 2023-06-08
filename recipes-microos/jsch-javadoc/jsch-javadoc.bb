SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.1.55"

RPM_NAME = "jsch-javadoc-0.1.55-2.6.noarch.rpm"
RPM_HASH = "a53a21df2e836e664544ced1d011e068ff59fae0c0147af85ca53da71bec0a84d705cd6df3c79fcbbf4c82e6038e16a26c6f5561f1f4c6effcfc3944700fa982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
