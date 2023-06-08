SUMMARY = "Official JDBC Driver for MySQL"
DESCRIPTION = "MySQL Connector/J is a native Java driver that converts JDBC (Java \
Database Connectivity) calls into the network protocol used by the \
MySQL database. It lets developers working with the Java programming \
language easily build programs and applets that interact with MySQL and \
connect all corporate data, even in a heterogeneous environment. MySQL \
Connector/J is a Type IV JDBC driver and has a complete JDBC feature \
set that supports the capabilities of MySQL."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.33"

RPM_NAME = "mysql-connector-java-8.0.33-1.1.noarch.rpm"
RPM_HASH = "e8b3fabc3ce4e5f03b8d0c18985bceae6289fc2dbb9706da2f2d4bcc2d99cfdfa20029375ea01a9c248c058be1c845223ac319b0b19ee3db47bbdca318e6b3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm.mysql mvn(com.mysql:mysql-connector-j) mvn(com.mysql:mysql-connector-j:pom:) mysql-connector-j mysql-connector-java mysql-connector-java-manual osgi(com.mysql.cj)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem jta mvn(com.google.protobuf:protobuf-java) reload4j slf4j"

inherit rpm
