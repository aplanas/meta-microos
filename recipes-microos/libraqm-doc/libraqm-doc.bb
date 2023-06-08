SUMMARY = "Libraqm documentation"
DESCRIPTION = "This package contains documentation files for raqm."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "libraqm-doc-0.10.1-1.1.noarch.rpm"
RPM_HASH = "fee7f5c368e94728bc790df852063210b920a4d656d9a49e979ab5b2edca7b2ecb99306cfbf6789b802918e9af95d6e86d37931624b0b11105a799d62d11c574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libraqm-doc"
RDEPENDS:${PN} += ""

inherit rpm
