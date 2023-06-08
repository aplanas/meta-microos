SUMMARY = "Checksums of the GNU Transport Layer Security Library"
DESCRIPTION = "FIPS SHA256 checksums of the libgnutls library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls30-hmac-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "e09d9583247658ef360262c65647a66269de2aea04bdce6b992b57c5f93f847b5fba71d2cdc7f581325253cc22efbe07877b87020d97c4233af7e233bc87ae05"

RPROVIDES:${PN} += "libgnutls30-hmac libgnutls30-hmac(aarch-64)"
RDEPENDS:${PN} += "libgnutls30"

inherit rpm
