SUMMARY = "Network Security Services Softoken Module checksums"
DESCRIPTION = "Checksums for libraries contained in the libsoftokn3 package \
used in the FIPS 140-2 mode."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libsoftokn3-hmac-3.89-2.1.aarch64.rpm"
RPM_HASH = "e9d14e4705c94cb3eb397c853e86b21b9ad209e30db62b1e658c0e9a8ba9ad854f3563bfd696cc7b7c77497f9ba41beb3248dd979fcdd344e2a442dc1d6ef8b9"

RPROVIDES:${PN} += "libsoftokn3-hmac libsoftokn3-hmac(aarch-64)"
RDEPENDS:${PN} += "libsoftokn3"

inherit rpm
