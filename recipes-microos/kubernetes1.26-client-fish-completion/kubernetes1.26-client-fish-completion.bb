SUMMARY = "Fish Completion for kubernetes1.26-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.26-client."
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-fish-completion-1.26.4-1.1.noarch.rpm"
RPM_HASH = "f01cf1dc0adaec796e3b52c3c707d0effa15d5605bccedb0afaa2d7ba32f6c9eeb7c0358d7640a405c6d79ac17dc3370269e1f240fd7f3ac75c3517a79402714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion kubernetes1.26-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.26-client"

inherit rpm
