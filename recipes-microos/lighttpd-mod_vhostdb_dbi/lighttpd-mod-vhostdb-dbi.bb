SUMMARY = "DBI based virtual hosts module for Lighttpd"
DESCRIPTION = "With DBI based vhosting you can put the information where to look for \
the document-root of a given host into any DBI supported database."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_vhostdb_dbi-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "f29d06b1dcf547c214caf6df65054a63ba5be144ebd8fb6d80be7e5ec78a121f73f4fd07bd1dc86bf6ade827e7484de9d80fdfb2fa15e9da738303df32c5c3b2"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_dbi lighttpd-mod_vhostdb_dbi(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libdbi.so.3()(64bit) libdbi.so.3(ABI_3)(64bit) lighttpd"

inherit rpm
