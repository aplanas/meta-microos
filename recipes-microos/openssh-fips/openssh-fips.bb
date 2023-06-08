SUMMARY = "OpenSSH FIPS crypto module HMACs"
DESCRIPTION = "This package contains hashes that, together with the main openssh packages, \
form the FIPS certifiable crypto module."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-fips-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "9a74cec93962d5643222bc2dd24394182cd0637fe29aa8c5ea2caa5e7eee5e9c61a8ed505c000e7842d5351ad78ce32cca1426e02a845492755c24bb6a926912"

RPROVIDES:${PN} += "openssh-fips openssh-fips(aarch-64)"
RDEPENDS:${PN} += "/bin/sh openssh-common"

inherit rpm
