SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-docs-6.3.1-1.2.noarch.rpm"
RPM_HASH = "1a0efd7d8ed836e6648882d75f60cd6e35b4526587ade53ded796a2b000da977366c84a0e09218deb6cb06c1bdd0d21dd3687ccd3f030b98a1ca27a918339fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs kernel-docs-srchash-8a31779f5544166bb801a03085764c84a737a62d"
RDEPENDS:${PN} += ""

inherit rpm
