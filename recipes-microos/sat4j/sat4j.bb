SUMMARY = "A library of SAT solvers written in Java"
DESCRIPTION = "The aim of the SAT4J library is to provide an efficient library of SAT \
solvers in Java. The SAT4J library targets first users of SAT 'black \
boxes', those willing to embed SAT technologies into their application \
without worrying about the details."
LICENSE = "EPL-1.0 & LGPL-2.0-only"

PV = "2.3.5"

RPM_NAME = "sat4j-2.3.5-2.6.noarch.rpm"
RPM_HASH = "17539d123a8c1639572075d1625940b9964465a07ba8d14160fc5f69413dc54aa753f740978b3fffc3b6a96c6c27d16a18bba3da33f71e26746b9e50e70527fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi(org.sat4j.core) osgi(org.sat4j.pb) sat4j"
RDEPENDS:${PN} += "java"

inherit rpm
