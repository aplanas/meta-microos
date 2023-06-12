SUMMARY = "The MATE Control Center -- Upstream Definition of Shell Content"
DESCRIPTION = "The control center is MATE's main interface for configuration of \
various aspects of your desktop. \
 \
This package provides the upstream definition of what appears in the \
control center."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-control-center-branding-upstream-1.26.1-1.1.noarch.rpm"
RPM_HASH = "72fdc4ea657d19aa2fdc589ce64b9fc0acae3009eda4ff6cc3063398b160ce451367dde8b8e3d60ea819ded326ce96ff4b47c7af248947ed183a825ce7f03349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-control-center-branding-upstream) mate-control-center-branding mate-control-center-branding-upstream"
RDEPENDS:${PN} += "mate-control-center"

inherit rpm
