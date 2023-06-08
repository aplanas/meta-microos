SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-gsm0338-1.0.0-2.3.noarch.rpm"
RPM_HASH = "d8f837beab1d068ca2a51be95b1978979e2fb3a600d8a4dd9714ae7858ca2b8502222f7bfecf7d60ec2216961fd9a1860233d0ece7a22615450ad76b18c56eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gsm0338 python3.10dist(gsm0338) python310-gsm0338 python3dist(gsm0338)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
