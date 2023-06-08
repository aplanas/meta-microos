SUMMARY = "Documents and examples for systemtap"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the documents and examples for systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "4.7"

RPM_NAME = "systemtap-docs-4.7-2.1.noarch.rpm"
RPM_HASH = "4cfd12ee376604690a35f082427510a6768255790f7213c8a0c2c405b032fb8c2a339dc1fc0697d750646aef42fb4233aa6e73b57d5fb1cfa65cca2f729efa21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemtap-docs"
RDEPENDS:${PN} += ""

inherit rpm
