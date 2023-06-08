SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python311-strict-rfc3339-0.7-4.1.noarch.rpm"
RPM_HASH = "5ad4e774c23c3237d4224894c0b007a5be951f4250756e86a7cb16478652b14545e8609cd21d11bf9dc7707204e7132ddb3bf550fd6900bd25fbdf3ad02afada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(strict-rfc3339) python311-strict-rfc3339 python3dist(strict-rfc3339)"
RDEPENDS:${PN} += "python(abi) timezone"

inherit rpm
