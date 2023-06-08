SUMMARY = "Private headers for rime"
DESCRIPTION = "This package provides private headers of Rime to build plugins."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime-private-devel-1.7.3-2.18.aarch64.rpm"
RPM_HASH = "b7b1d4f2534150ccd0049438d4503deac05baaf672577d08eb2c632a2727287defc8288fc629b326b2042ff0f654c7202d65487b9089038f013ecd56a4286fec"

RPROVIDES:${PN} += "librime-private-devel librime-private-devel(aarch-64)"
RDEPENDS:${PN} += "librime-devel"

inherit rpm
