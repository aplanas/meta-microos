SUMMARY = "Binary files of dviinfox"
DESCRIPTION = "Binary files of dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44515"

RPM_NAME = "texlive-dviinfox-bin-2023.20230311.svn44515-89.1.aarch64.rpm"
RPM_HASH = "54fff8ff82ad46ca2fc00a46cf914703b08b2c0c337d17119d3220008dbb5c966b0b54ec968244a71e698417a1e7321b8307d0df4600b9e07ee25ea0ad509d5c"

RPROVIDES:${PN} += "texlive-dviinfox-bin texlive-dviinfox-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-dviinfox"

inherit rpm
