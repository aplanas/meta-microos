SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-softlayer-zeep-5.0.0-1.6.noarch.rpm"
RPM_HASH = "b1f6b2e45c616a79fb0dc4751346384509f2e4cb631623935d8344d49ec937cf7fdf01f2dffd94f1a53013b5aa786d8478ac782970d54526be0f4310175f4487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-softlayer-zeep \
python3-zeep \
python3.10dist(softlayer-zeep) \
python310-softlayer-zeep \
python310-zeep \
python3dist(softlayer-zeep)"
RDEPENDS:${PN} += "python(abi) \
python310-attrs \
python310-isodate \
python310-lxml \
python310-platformdirs \
python310-pytz \
python310-requests \
python310-requests-file \
python310-requests-toolbelt"

inherit rpm
