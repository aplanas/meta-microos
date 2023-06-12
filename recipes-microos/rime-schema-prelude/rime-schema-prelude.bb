SUMMARY = "prelude input schema for rime"
DESCRIPTION = "prelude input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-prelude-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "58d4af6c65527750f8cb3ba2dabeb218f88ab4a137613ffe96b546f4b2a0fa910b4ba143089da57fddde73ad8b9bac698897226ae221b8c6a74f87969656d56f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-prelude"
RDEPENDS:${PN} += ""

inherit rpm
