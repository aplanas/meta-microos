SUMMARY = "Fish Completion for helm"
DESCRIPTION = "Fish command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.11.3"

RPM_NAME = "helm-fish-completion-3.11.3-2.1.noarch.rpm"
RPM_HASH = "05e9a298ebb0e3024df800116ee690a32a07798a95eb1aa37bd20838d26f23f6ee14567826254cc9008648e0dee554a6e77a296bff58fd975db21859be320183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-fish-completion"
RDEPENDS:${PN} += "helm"

inherit rpm
