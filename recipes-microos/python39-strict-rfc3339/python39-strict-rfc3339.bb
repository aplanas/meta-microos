SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python39-strict-rfc3339-0.7-4.1.noarch.rpm"
RPM_HASH = "1f2fd4fcdf5bad1f5b573711bca551495bd5f857f22df7ae84267aa40eaef1dfeca1a89c70e5d03f90eaeca35b0ed4d4053c1755a10dae152c585dc8d3c4227c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(strict-rfc3339) python39-strict-rfc3339 python3dist(strict-rfc3339)"
RDEPENDS:${PN} += "python(abi) timezone"

inherit rpm
