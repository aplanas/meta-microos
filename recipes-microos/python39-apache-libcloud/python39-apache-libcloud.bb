SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python39-apache-libcloud-3.7.0-1.5.noarch.rpm"
RPM_HASH = "673d703c3805f7b38ab3d6aba226c9d9ec9411caecf1ce1b81c943b24de6fe346f3220dae962500e9221d1fee360c774bb596b796118e9a1730de2a7613a91c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(apache-libcloud) python39-apache-libcloud python3dist(apache-libcloud)"
RDEPENDS:${PN} += "python(abi) python39-lxml python39-requests python39-typing"

inherit rpm
