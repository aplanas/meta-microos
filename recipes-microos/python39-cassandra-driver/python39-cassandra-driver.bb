SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.26.0"

RPM_NAME = "python39-cassandra-driver-3.26.0-1.2.aarch64.rpm"
RPM_HASH = "c742cd4dc0a6bba34d27df85a186dcafed372c54c3de4a91a72e00811a45fdb9e25e38b657ab5b938bb61b0768b255826974ece70075f2ef00e52752c9ef159f"

RPROVIDES:${PN} += "python3.9dist(cassandra-driver) python39-cassandra-driver python39-cassandra-driver(aarch-64) python3dist(cassandra-driver)"
RDEPENDS:${PN} += "python(abi) python39-Cython python39-geomet python39-six"

inherit rpm
