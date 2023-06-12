SUMMARY = "HMAC files for FIPS-140-2 integrity checking of the openssl shared libraries"
DESCRIPTION = "The FIPS compliant operation of the openssl shared libraries is NOT \
possible without the HMAC hashes contained in this package!"
LICENSE = "BSD-3-Clause"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-hmac-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "258f0f133851a767cfe650bb7f2e01c0fd48c3c860f44be74dd5a9d68bd040c15789eac3088a5375133f0b7e66ff306f29f14de943f58f74e90f021a0485d579"

RPROVIDES:${PN} += "libopenssl1_0_0-hmac libopenssl1_0_0-hmac(aarch-64)"
RDEPENDS:${PN} += "libopenssl1_0_0"

inherit rpm
