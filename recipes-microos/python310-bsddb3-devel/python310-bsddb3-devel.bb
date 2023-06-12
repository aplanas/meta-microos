SUMMARY = "Development files for python310-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python310-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python310-bsddb3-devel-6.2.9-1.13.aarch64.rpm"
RPM_HASH = "f806f1247c48fc92a1b09950face4350cb656483052404e49aeba2504ad53aae99413627891fa310d8714c92cd1fd0e4868f20dc942e67d4e404fc68428f3fda"

RPROVIDES:${PN} += "python3-bsddb3-devel \
python310-bsddb3-devel \
python310-bsddb3-devel(aarch-64)"
RDEPENDS:${PN} += "python310-bsddb3"

inherit rpm
