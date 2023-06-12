SUMMARY = "NetBeans Java Parser"
DESCRIPTION = "Java parser to analyse Java source files inside of the NetBeans IDE"
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "6.8"

RPM_NAME = "netbeans-javaparser-6.8-21.6.noarch.rpm"
RPM_HASH = "64cf6277c767f3ee6395ff21405c32dce4447c1c5f763af799165ccd810ad2d230a01cfa27fb70592deb9f8cb0d87af36109b8a18bf2097bdac7456a53ec125e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-javaparser"
RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
