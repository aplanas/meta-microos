SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-doc-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "b9f7e9e501b949280a8a8d380901f821fc334f13471320f0d1861ee8d103ab68bb23dbc55d35175fc451a4c4526bc10b4e943833cbef0e4dd74e1885b6cdef5d"

RPROVIDES:${PN} += "pipewire-doc pipewire-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
