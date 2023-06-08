SUMMARY = "wxWidgets Documentation"
DESCRIPTION = "This package contains wxWidgets documentation in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "wxWidgets-3_0-docs-3.0.5-1.8.noarch.rpm"
RPM_HASH = "f3dd6b8739d7189d256cec2df26c4d8c6ecc4970f519902e8157b88f88b076ceea4845827e22198beee9bfa9af0c834f5b479645f8c482cbf344c822c5f8872e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3_0-docs wxWidgets-docs"
RDEPENDS:${PN} += ""

inherit rpm
