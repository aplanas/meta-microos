SUMMARY = "Documentation for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN. \
 \
This packages provides documentation and help files for openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.10"

RPM_NAME = "openconnect-doc-9.10-1.1.noarch.rpm"
RPM_HASH = "34a6763007bf31b4b2a051700b793203a25504270164e741767a9790f3e40900c3c1214f111119ce2d719a82e3ad32f251da61d91f897d73696ccd8c48477c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openconnect-doc"
RDEPENDS:${PN} += ""

inherit rpm
