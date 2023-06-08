SUMMARY = "Apache Servlet/JSP/EL Engine, RI for Servlet 4.0/JSP 2.3/EL 3.0 API"
DESCRIPTION = "Tomcat is the servlet container that is used in the official Reference \
Implementation for the Java Servlet and JavaServer Pages technologies. \
The Java Servlet and JavaServer Pages specifications are developed by \
Sun under the Java Community Process. \
 \
ATTENTION: This tomcat is built with java 1.8.0."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-9.0.43-16.1.noarch.rpm"
RPM_HASH = "bf108c63de9c5104de5bb9e69c9232db44000c4deb961cc90a1db37643ef173e3cd20881c57013993e6cd52fa6e339bbbb510a94525b3052388edc74d2d1fd94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tomcat) tomcat"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch /usr/sbin/groupadd /usr/sbin/useradd apache-commons-daemon apache-commons-dbcp apache-commons-logging apache-commons-pool2 fillup java tomcat-lib"

inherit rpm
