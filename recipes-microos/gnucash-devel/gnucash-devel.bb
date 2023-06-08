SUMMARY = "Development files for GnuCash"
DESCRIPTION = "This package provides all the necessary files for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "gnucash-devel-4.14-1.2.aarch64.rpm"
RPM_HASH = "db9e01a9362a353b7a25422de0484526f22ad57efe4bf916888e364d2208a06fb9823d99fc3273e850d55328523c74f7336b531db108ee298773ba01de23676f"

RPROVIDES:${PN} += "gnucash-devel gnucash-devel(aarch-64)"
RDEPENDS:${PN} += "gnucash"

inherit rpm
