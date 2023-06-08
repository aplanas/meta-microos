SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.559.aarch64.rpm"
RPM_HASH = "cc72e8fd5d477dbd40eb83a3803bd6a4454c56436a41e0a0ba3a9814b63858aee5919c07445d36c8c0e014107c212baa930038fd2964a7e285159da8366ea058"

RPROVIDES:${PN} += "wsl-appx wsl-appx(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
