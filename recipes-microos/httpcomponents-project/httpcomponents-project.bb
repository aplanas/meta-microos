SUMMARY = "Common POM file for HttpComponents"
DESCRIPTION = "Common Maven POM  file for HttpComponents. This project should be \
required only for building dependent packages with Maven. Please don't \
use it as runtime requirement."
LICENSE = "Apache-2.0"

PV = "9"

RPM_NAME = "httpcomponents-project-9-1.11.noarch.rpm"
RPM_HASH = "61a5de7f1c4b395760c1e80ab3dd1adda2bcc17db68b2467cf9be0f20f019bb3fdeb7e8cdee1115b3da8622532af2148cd89e124415e42efc465d3adb5dfd03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-project \
mvn(org.apache.httpcomponents:httpcomponents-parent:pom:) \
mvn(org.apache.httpcomponents:project:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache:apache:pom:)"

inherit rpm
