SUMMARY = "The MATE Control Center -- Upstream Definition of Shell Content"
DESCRIPTION = "The control center is MATE's main interface for configuration of \
various aspects of your desktop. \
 \
This package provides the upstream definition of what appears in the \
control center."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-control-center-branding-upstream-1.26.0-1.10.noarch.rpm"
RPM_HASH = "256128a7ede6415ac965c91ad2ba0e737d5ba1942caf9aca5ef36e0bbc5e1fa312aefd33f65fcc126913629859da289f272a4e5d6f47ca0aa2cb001e93685ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-control-center-branding-upstream) mate-control-center-branding mate-control-center-branding-upstream"
RDEPENDS:${PN} += "mate-control-center"

inherit rpm
