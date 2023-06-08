SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python311-click-default-group-1.2.2-2.8.noarch.rpm"
RPM_HASH = "0a60407c745ab2e00a5a646333c82e644106c158aff839158459cb2a082000ef976a6517f302ea8c3bdc4d05aa27678e9a1e2a26bdb1b0a8ebe1a8af5461a2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-default-group) python311-click-default-group python3dist(click-default-group)"
RDEPENDS:${PN} += "python(abi) python311-click"

inherit rpm
