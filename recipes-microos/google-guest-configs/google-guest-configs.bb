SUMMARY = "Google Cloud Guest Configs"
DESCRIPTION = "Google Cloud Guest Configs"
LICENSE = "Apache-2.0"

PV = "20230217.01"

RPM_NAME = "google-guest-configs-20230217.01-1.1.noarch.rpm"
RPM_HASH = "7679703c345a0d869deb883c88770a167544b522d2dab634c909c5d951efa4413065f03c7b86fa4d4f07a223f9cc25056bddfcbf907bbf869b9ca01145574b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(google-guest-configs) google-guest-configs"
RDEPENDS:${PN} += "/bin/bash nvme-cli"

inherit rpm
