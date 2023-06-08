SUMMARY = "Bash tab-completion for libnbd"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd-bash-completion-1.14.1-2.1.noarch.rpm"
RPM_HASH = "91474ea0d6c599a87f83ceef2b6a18b844c37bd3fb01757fb30538766562b4fef2a9fac637a803b30036cd654f95ebae7d11b760c4e542ce7680df79e6c9075e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnbd-bash-completion"
RDEPENDS:${PN} += "bash-completion libnbd0"

inherit rpm
