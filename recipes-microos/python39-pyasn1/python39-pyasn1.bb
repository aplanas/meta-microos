SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pyasn1-0.5.0-1.1.noarch.rpm"
RPM_HASH = "3195e79f36aee08ed3e727e97076f8a305c2d690d21a970da46cf3b765f7eef7e6aef79013744a4ccce2398a63a10b1009ba7a41f2676495f0e8b02c18e8d933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyasn1) python39-pyasn1 python3dist(pyasn1)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
