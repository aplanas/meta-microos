SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-ruamel.std.pathlib-0.9.2-2.3.noarch.rpm"
RPM_HASH = "7049f8fbdca0680fd8cef769bec9fd453ac425c1d6a421d538c929479927ef258a5d12d6bcb68ac1bc9c30177e9ccf46424dcb7c8e4c16b2143c8da7f16efbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ruamel.std.pathlib) \
python311-ruamel.std.pathlib \
python3dist(ruamel.std.pathlib)"
RDEPENDS:${PN} += "python(abi) \
python311-ruamel.base"

inherit rpm
