SUMMARY = "[global] extra for python311-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python311-pytoolconfig-global-1.2.4-1.4.noarch.rpm"
RPM_HASH = "bc4268491a6a58d8f2f3a0f0dbb9ddac675c6f5ad7139b899df211e1c857d5d4e07a366a4bf3efb0ffd2fdb59f1f3ff2647794f55c0e9504fd1243bfd403dbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pytoolconfig-global"
RDEPENDS:${PN} += "python311-platformdirs \
python311-pytoolconfig"

inherit rpm
