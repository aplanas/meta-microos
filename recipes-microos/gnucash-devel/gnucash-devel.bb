SUMMARY = "Development files for GnuCash"
DESCRIPTION = "This package provides all the necessary files for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "gnucash-devel-4.14-1.3.aarch64.rpm"
RPM_HASH = "90ba0d4caacbbe52b57fc8cdfb3fc3cfe79b20b81deffc0cbc5d3c2409ade01cf73773ddb1b48e0daa2321dab38f7fb08a6106709b3c996b696ea78f667b0c28"

RPROVIDES:${PN} += "gnucash-devel \
gnucash-devel(aarch-64)"
RDEPENDS:${PN} += "gnucash"

inherit rpm
