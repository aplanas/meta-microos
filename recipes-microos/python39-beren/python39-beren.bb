SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python39-beren-0.7.1-3.6.aarch64.rpm"
RPM_HASH = "2ae5332eea2cb388ecf8e72d84d9ec2a690ba1b4104ca46f6065d96b12666e1e88e301db0b3f3412db0de5646ce711d4c29c77bfca993a9466db383d172c28b0"

RPROVIDES:${PN} += "python3.9dist(beren) \
python39-beren \
python39-beren(aarch-64) \
python3dist(beren)"
RDEPENDS:${PN} += "python(abi) \
python39-apiron"

inherit rpm
