SUMMARY = "HMAC files for FIPS-140-2 integrity checking of the openssl shared libraries"
DESCRIPTION = "The FIPS compliant operation of the openssl shared libraries is NOT \
possible without the HMAC hashes contained in this package!"
LICENSE = "BSD-3-Clause"

PV = "1.1.1t"

RPM_NAME = "libopenssl1_1-hmac-1.1.1t-3.1.aarch64.rpm"
RPM_HASH = "6ac4c098e10f4906362e5f65cea17e6123488c6a21add8d3bc24a3235bf7c18069a5c01955d93b81f54853ee3151cecf76bd156a16178fa1bbc309daa535f31a"

RPROVIDES:${PN} += "libopenssl1_1-hmac libopenssl1_1-hmac(aarch-64)"
RDEPENDS:${PN} += "libopenssl1_1"

inherit rpm
