SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-docs-common-6.5.0-3.1.noarch.rpm"
RPM_HASH = "6a0a96904756bbb25095e21e4a6d5ba79293c720f254423424655444b537133426b10f00ba91fa4beaf8763d09a067310223b7da6d6580135e92ab0517084138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"
RDEPENDS:${PN} += ""

inherit rpm
