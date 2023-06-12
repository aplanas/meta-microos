SUMMARY = "Java Bindings for the Berkeley DB"
DESCRIPTION = "These are the Java bindings for the Berkeley DB. They are needed for \
the Java support of db and dbxml. \
 \
These are the development files."
LICENSE = "BSD-3-Clause"

PV = "4.8.30"

RPM_NAME = "libdb_java-4_8-devel-4.8.30-41.1.aarch64.rpm"
RPM_HASH = "c280db0000d3cde1244ea951e0362e2b9104bfd7a9c528b2870b1c69b7bd14e06507afa0a47300c067aff15db40b2192aa4bd7896a489a54b8ac7ab4379cf35c"

RPROVIDES:${PN} += "db-java-devel \
libdb_java-4_8-devel \
libdb_java-4_8-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libdb_java-4_8"

inherit rpm
