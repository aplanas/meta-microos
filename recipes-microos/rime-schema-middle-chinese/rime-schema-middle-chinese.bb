SUMMARY = "middle-chinese input schema for rime"
DESCRIPTION = "middle-chinese input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-middle-chinese-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "4672ef1326e58a3e9f22fc7bd79e353cb631ad4b357f0cad59164c5a6f6eaa3c870023c3cc1e5c6c12d3d43ef1879af666f346ab15f2ebd35b2585203fd71203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-middle-chinese"
RDEPENDS:${PN} += ""

inherit rpm
