SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "python39-google-cloud-core-2.3.2-1.3.noarch.rpm"
RPM_HASH = "dab698de53de1c2bfba258d1df3b41394885d2f0ed56d1c5171f450a6d4211a0296c7dce94b91d7ed048d01530c516146c89dac8a44a6d803fef9f50a59a1c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-cloud-core) \
python39-google-cloud-core \
python3dist(google-cloud-core)"
RDEPENDS:${PN} += "python(abi) \
python39-google-api-core \
python39-google-auth \
python39-six"

inherit rpm
