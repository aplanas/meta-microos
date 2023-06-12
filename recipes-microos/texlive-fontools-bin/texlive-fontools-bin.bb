SUMMARY = "Binary files of fontools"
DESCRIPTION = "Binary files of fontools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25997"

RPM_NAME = "texlive-fontools-bin-2023.20230311.svn25997-91.1.aarch64.rpm"
RPM_HASH = "c44b2e28c672fcbdb8bb9ba6551e70c35efc1bafbbcd9f3ec6d191f4874fa37eb57437ba2beb984b61fb4af8bdc9ead266b9f87720a6052ad2120b1aec015fa6"

RPROVIDES:${PN} += "texlive-fontools-bin texlive-fontools-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fontools"

inherit rpm
