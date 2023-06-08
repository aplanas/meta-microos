SUMMARY = "Binary files of de-macro"
DESCRIPTION = "Binary files of de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17399"

RPM_NAME = "texlive-de-macro-bin-2023.20230311.svn17399-89.1.aarch64.rpm"
RPM_HASH = "310c1ffe5f163ae64c8871a560e4abb994645a790dc0027427b41f8735078a0486bedc0471a56da1c7a8f3f9d7e0ed91c73b0e5391ba2bec4233bb5efca9befb"

RPROVIDES:${PN} += "texlive-de-macro-bin texlive-de-macro-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-de-macro"

inherit rpm
