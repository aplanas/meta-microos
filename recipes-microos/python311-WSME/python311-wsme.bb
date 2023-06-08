SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-WSME-0.11.0-2.6.noarch.rpm"
RPM_HASH = "a7cc01a549c38d851b84baa5fc5b7d2ec38f6c62cf2384a611d16f50172e21ee09b170e222ebc54f2fa8354ac212dc3951ca7a4738a4f2afe12860fff880bdbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wsme) python311-WSME python3dist(wsme)"
RDEPENDS:${PN} += "python(abi) python311-WebOb python311-netaddr python311-pytz python311-simplegeneric"

inherit rpm
