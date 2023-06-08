SUMMARY = "Minuet: Build Environment"
DESCRIPTION = "Development headers and libraries for Minuet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "minuet-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9f5e086a90bb548690d485327eb49a152ed883f8ca7fd5e7a21801117fab2de41bed57f530758c0b1e06882f67073b8d9c779beac4a9dd123ebd21e2cdbdc2bc"

RPROVIDES:${PN} += "minuet-devel minuet-devel(aarch-64)"
RDEPENDS:${PN} += "minuet"

inherit rpm
