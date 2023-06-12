SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-softlayer-zeep-5.0.0-1.6.noarch.rpm"
RPM_HASH = "3b09c013fa4169180201ed54b58ab5c83de66d7d6c809014d2dbe3aa3d7302ef65f07176ff4096963ffed4512c88f59e9a38e7844523754fd1dc9efb5129870d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(softlayer-zeep) \
python311-softlayer-zeep \
python311-zeep \
python3dist(softlayer-zeep)"
RDEPENDS:${PN} += "python(abi) \
python311-attrs \
python311-isodate \
python311-lxml \
python311-platformdirs \
python311-pytz \
python311-requests \
python311-requests-file \
python311-requests-toolbelt"

inherit rpm
