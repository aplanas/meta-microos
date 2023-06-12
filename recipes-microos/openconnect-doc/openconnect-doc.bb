SUMMARY = "Documentation for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN. \
 \
This packages provides documentation and help files for openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "openconnect-doc-9.12-1.1.noarch.rpm"
RPM_HASH = "96eba23d99e9ef5189b699f52db8b271fcf8260cbc63d24f7df7f04400435cb18129f76acd6eb91ccc345193fec553481d19e9cafaea375cb04f3a2db25b3e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openconnect-doc"
RDEPENDS:${PN} += ""

inherit rpm
