SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-javadoc-2.0.05-32.5.noarch.rpm"
RPM_HASH = "d491029da662cefe581ed47e3190025fd505998df24d271bf020d03921012bd70ccce9b05de6d97aec6b562a2b785f950f205b13f1a991a43a0c75b1a9d73be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
