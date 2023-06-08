SUMMARY = "HMAC checksums for the GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose crypto library based on the code used in \
GnuPG (alpha version). This package contains the HMAC checksum files \
for integrity checking the library, as required by FIPS 140-2."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.2"

RPM_NAME = "libgcrypt20-hmac-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "aae67fa816834c0160c68cedc06a88b29b685e727d4c0295f883249ca92210a35a2cbe6ce26dd4570ff6231c0c1014fa804d8d6d2457a5ad5aecac620ce44424"

RPROVIDES:${PN} += "libgcrypt20-hmac libgcrypt20-hmac(aarch-64)"
RDEPENDS:${PN} += "libgcrypt20"

inherit rpm
