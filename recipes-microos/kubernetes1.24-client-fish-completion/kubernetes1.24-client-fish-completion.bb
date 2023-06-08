SUMMARY = "Fish Completion for kubernetes1.24-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.24-client."
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-fish-completion-1.24.13-2.1.noarch.rpm"
RPM_HASH = "fee7022181a2e2b23fdbb28dadd635e1c257b9a6438f22dc0b2d164d1c6e5fb20ff51d5f49285286f44692527fd7c29078c7f6133319fc426bda7785fd6a3a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion kubernetes1.24-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.24-client"

inherit rpm
