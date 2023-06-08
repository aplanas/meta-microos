SUMMARY = "Javadoc generated documentation for Apache Tomcat"
DESCRIPTION = "Javadoc generated documentation files for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-javadoc-9.0.43-16.1.noarch.rpm"
RPM_HASH = "fc5f90de6f86371a6e7b3800c418937e023bc1f3f8e7efd5ef3623162913da3c8a0564956a6dbf56b5b44df2059542c2c85075de63e22c20cbc219bdb78c08db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
