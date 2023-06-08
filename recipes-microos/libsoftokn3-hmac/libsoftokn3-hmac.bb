SUMMARY = "Network Security Services Softoken Module checksums"
DESCRIPTION = "Checksums for libraries contained in the libsoftokn3 package \
used in the FIPS 140-2 mode."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libsoftokn3-hmac-3.89-1.1.aarch64.rpm"
RPM_HASH = "6c5af90176daf16df06b4da6bacc40c5b30b62efa5e2ed8af759eaf0e41f2c945355689bebf21d61de220053b549ad944306e4a93390acdc44ce7967d5553fe9"

RPROVIDES:${PN} += "libsoftokn3-hmac libsoftokn3-hmac(aarch-64)"
RDEPENDS:${PN} += "libsoftokn3"

inherit rpm
