SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud OSConfig Agent"
LICENSE = "Apache-2.0"

PV = "20230222.00"

RPM_NAME = "google-osconfig-agent-20230222.00-2.3.aarch64.rpm"
RPM_HASH = "45f30b1cc674fd554e01428660e10745e3cc0d2fe482f8b43f90d1bd4201c4b2b1a70609af57e9a74b84883bc9d8334c0d2ec82e2c5a15b811dd9e6fa854063b"

RPROVIDES:${PN} += "google-osconfig-agent \
google-osconfig-agent(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
google-guest-configs"

inherit rpm
