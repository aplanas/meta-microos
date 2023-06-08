SUMMARY = "HMAC files for FIPS 140-3 integrity checking of the openssl shared libraries"
DESCRIPTION = "The FIPS compliant operation of the openssl shared libraries is NOT \
possible without the HMAC hashes contained in this package!"
LICENSE = "BSD-3-Clause"

PV = "3.0.8"

RPM_NAME = "libopenssl3-hmac-3.0.8-2.3.aarch64.rpm"
RPM_HASH = "b45b6989ba63167e1c11efa80536a606526821d48cd69ecb84076ec783623d0f0e1be5112e99379235b62bad78ccc0963cc4e62144601e76bb13af451689d4eb"

RPROVIDES:${PN} += "libopenssl3-hmac libopenssl3-hmac(aarch-64)"
RDEPENDS:${PN} += "libopenssl3"

inherit rpm
