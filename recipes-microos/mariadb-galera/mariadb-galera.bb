SUMMARY = "The configuration files and scripts for galera replication"
DESCRIPTION = "This package contains configuration files and scripts that are \
needed for running MariaDB Galera Cluster."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.2"

RPM_NAME = "mariadb-galera-10.11.2-2.3.aarch64.rpm"
RPM_HASH = "a781b2aedf283006f7a6bccb29a270001f577062be5c48add53e2e9f2620371eb79f0d3af984ea67a70a25ea9e05df9f3249d444f1c1ca34976a746d33a68975"

RPROVIDES:${PN} += "config(mariadb-galera) mariadb-galera mariadb-galera(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env galera-4 iproute2 lsof mariadb rsync socat which"

inherit rpm
