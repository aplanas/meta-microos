SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.23.12"

RPM_NAME = "mpd-doc-0.23.12-1.3.noarch.rpm"
RPM_HASH = "aee94afe28b92851b112fbfd741e0ca46394cf23225fcf27b451caeb256852cd812c391210b5812ec4f646627233b6ca3d9e6c81a5c7277d45b5fe01a805edf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpd-doc"
RDEPENDS:${PN} += ""

inherit rpm
