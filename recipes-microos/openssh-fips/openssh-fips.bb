SUMMARY = "OpenSSH FIPS crypto module HMACs"
DESCRIPTION = "This package contains hashes that, together with the main openssh packages, \
form the FIPS certifiable crypto module."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-fips-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "b103b5b2dcec65eb17db3562bce5ce46ed004a4a348ea0f877afd8be2ad4e2af989c7eb958f528839d1594953d5d846b1812d763b71b69d36e263bbe40d42249"

RPROVIDES:${PN} += "openssh-fips openssh-fips(aarch-64)"
RDEPENDS:${PN} += "/bin/sh openssh-common"

inherit rpm
