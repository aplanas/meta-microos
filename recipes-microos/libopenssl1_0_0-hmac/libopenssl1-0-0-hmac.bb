SUMMARY = "HMAC files for FIPS-140-2 integrity checking of the openssl shared libraries"
DESCRIPTION = "The FIPS compliant operation of the openssl shared libraries is NOT \
possible without the HMAC hashes contained in this package!"
LICENSE = "BSD-3-Clause"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-hmac-1.0.2u-15.1.aarch64.rpm"
RPM_HASH = "b738f4ec9666e7e01ecda6661321307d787411d30beafad4b6c4e9050df347b5c6d79e24241fe97ed5202bb022052b67a2ef6afc404de3accc6faea2d10c0e67"

RPROVIDES:${PN} += "libopenssl1_0_0-hmac libopenssl1_0_0-hmac(aarch-64)"
RDEPENDS:${PN} += "libopenssl1_0_0"

inherit rpm
