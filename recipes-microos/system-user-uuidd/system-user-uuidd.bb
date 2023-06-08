SUMMARY = "System user and group uuidd"
DESCRIPTION = "This package provides the system account and group 'uuidd'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-uuidd-20170617-24.14.noarch.rpm"
RPM_HASH = "49d2b7dfddc9b7f338b6ebc144da4677c6b6e9e6cf3da548f2c1a69e3e957d194b8682354f9cf56833c523d3b816bb14bce88178d3f7a0e9691e4c408f54c065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(uuidd) system-user-uuidd user(uuidd)"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
