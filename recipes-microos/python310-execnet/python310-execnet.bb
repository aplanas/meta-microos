SUMMARY = "Rapid multi-Python deployment"
DESCRIPTION = "execnet provides a share-nothing model with \
channel-send/receive communication for distributing \
execution across many Python interpreters across version, \
platform and network barriers. It has a minimal and fast \
API targetting the following uses: \
 \
 * distribute tasks to (many) local or remote CPUs \
 * write and deploy hybrid multi-process applications \
 * write scripts to administer multiple environments"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-execnet-1.9.0-3.1.noarch.rpm"
RPM_HASH = "7a01ba0fd010381d9708e927fe68363f8405f60dc7b16342e4fddb528da68246ca3fc0b54533b3262ba17057cb4de95165dc93abb279fa4293da01dc7bbecd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-execnet \
python3.10dist(execnet) \
python310-execnet \
python3dist(execnet)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
