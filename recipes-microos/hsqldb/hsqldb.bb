SUMMARY = "HyperSQL Database Engine"
DESCRIPTION = "HSQLdb is a relational database engine written in JavaTM , with a JDBC \
driver, supporting a subset of ANSI-92 SQL. It offers a small (about \
100k), fast database engine which offers both in memory and disk based \
tables. Embedded and server modes are available. Additionally, it \
includes tools such as a minimal web server, in-memory query and \
management tools (can be run as applets or servlets, too) and a number \
of demonstration examples. \
 \
Downloaded code should be regarded as being of production quality. The \
product is currently being used as a database and persistence engine in \
many Open Source Software projects and even in commercial projects and \
products! In it's current version it is extremely stable and reliable. \
It is best known for its small size, ability to execute completely in \
memory and its speed. Yet it is a completely functional relational \
database management system that is completely free under the Modified \
BSD License. Yes, that's right, completely free of cost or \
restrictions!"
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "hsqldb-2.7.1-1.2.noarch.rpm"
RPM_HASH = "8dc98172131cb9ae05ebca6be90d57906d765e1f1a1107c1f5c5993da2190254d927dc1cb83cfc699cabc315800c317c0864a72904cecb64a87ff256d44d3ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(hsqldb) \
hsqldb \
mvn(org.hsqldb:hsqldb) \
mvn(org.hsqldb:hsqldb:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java \
java-headless \
javapackages-filesystem \
servletapi5 \
systemd"

inherit rpm
