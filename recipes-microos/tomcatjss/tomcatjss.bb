SUMMARY = "JSS Connector for Apache Tomcat"
DESCRIPTION = "JSS Connector for Apache Tomcat, installed via the tomcatjss package, \
is a Java Secure Socket Extension (JSSE) module for Apache Tomcat that \
uses Java Security Services (JSS), a Java interface to Network Security \
Services (NSS)."
LICENSE = "LGPL-2.0-or-later"

PV = "7.4.1"

RPM_NAME = "tomcatjss-7.4.1-2.6.noarch.rpm"
RPM_HASH = "261388a20e80e85d80aa5379e208a7ea3c310a9945d2b86702c6961a6c19086844f3a8b5374db527941e3ad7c8b76548e73bfea93957228e4515a6ed50019d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcatjss"
RDEPENDS:${PN} += "apache-commons-lang mozilla-jss slf4j slf4j-jdk14 tomcat"

inherit rpm
