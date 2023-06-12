SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-doc-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "5bbbcf8987afbabb821ab03bb209e8a4a1dd06c0b2f473d0d67404daaf953cdb5e855a4d6932f7c849d01af249990cbbacd4fcc298b733f036bfefbffe14302c"

RPROVIDES:${PN} += "pipewire-doc pipewire-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
