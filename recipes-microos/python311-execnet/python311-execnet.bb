SUMMARY = "Rapid multi-Python deployment"
DESCRIPTION = "execnet provides a share-nothing model with \
channel-send/receive communication for distributing \
execution across many Python interpreters across version, \
platform and network barriers. It has a minimal and fast \
API targetting the following uses: \
 \
 * distribute tasks to (many) local or remote CPUs \
 * write and deploy hybrid multi-process applications \
 * write scripts to administer multiple environments"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-execnet-1.9.0-3.1.noarch.rpm"
RPM_HASH = "e1fa417dcd720d4527f3b710ac168f82356ce73636cb77968251705fe1d2519166986136531331eaa0f931bd986c4aaa4e3ec63dbb8c39b0f7e8208bda496f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(execnet) python311-execnet python3dist(execnet)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
