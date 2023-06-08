SUMMARY = "Documentation for OpenStack Identity API Client"
DESCRIPTION = "Documentation for the client library for interacting with Openstack \
Identity API."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python-keystoneclient-doc-4.5.0-1.5.noarch.rpm"
RPM_HASH = "c2df39652c2302eb6e6a980aa4e442b05256713281b295432ef4a9ca2d36a5cf3618f3f988ec278726e86eda7d1ea561486a3021085535e6a42375ad43d10857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneclient-doc"
RDEPENDS:${PN} += ""

inherit rpm
