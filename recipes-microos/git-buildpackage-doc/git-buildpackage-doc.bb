SUMMARY = "Documentation for the git-buildpackage suite"
DESCRIPTION = "This package contains documentation for the git-buildpackage suite - both the \
Debian and the RPM tool set."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-doc-0.9.23-1.2.noarch.rpm"
RPM_HASH = "31e3fe02a96a4c959ef04909b0ac7c0219a8a47202192603c57390e38d962213119b1dea8c472b6dddae1ec25495fdcb08ca63822b1772ab5e73ab4d755c1e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage-doc"
RDEPENDS:${PN} += ""

inherit rpm
