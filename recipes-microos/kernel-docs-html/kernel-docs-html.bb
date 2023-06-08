SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-docs-html-6.3.1-1.2.noarch.rpm"
RPM_HASH = "5406e7897456e7c71f871aaa5e851ebca17e3113b363356e60a0687ff7436485076fa2610725e9ba6e30dba07288e506caa953fb42a5187bcc7b768d3d44bf2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"
RDEPENDS:${PN} += ""

inherit rpm
