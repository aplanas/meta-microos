SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.26.0"

RPM_NAME = "python311-cassandra-driver-3.26.0-1.2.aarch64.rpm"
RPM_HASH = "f4ecce91131dd631f75deb67619d90522ff25b732c46275b7c224be8d9c86153c83020f63bbe10b5a74af4f8c330557df9457cbb959f89f46992206bdf96c668"

RPROVIDES:${PN} += "python3.11dist(cassandra-driver) python311-cassandra-driver python311-cassandra-driver(aarch-64) python3dist(cassandra-driver)"
RDEPENDS:${PN} += "python(abi) python311-Cython python311-geomet python311-six"

inherit rpm
