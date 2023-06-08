SUMMARY = "Checksums for libcryptsetup12"
DESCRIPTION = "This package contains HMAC checksums for integrity checking of libcryptsetup4, \
used for FIPS."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "libcryptsetup12-hmac-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "bc3d2d77e97cd8f3fc56a4ae57634b6eaca7683aed2eb1ff257cab11902eb57b8931ec079f2f130f9a26bf9542cffc74494cd296c76f7e7eea387b0a79c988cf"

RPROVIDES:${PN} += "libcryptsetup12-hmac libcryptsetup12-hmac(aarch-64)"
RDEPENDS:${PN} += "libcryptsetup12"

inherit rpm
