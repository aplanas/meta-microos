SUMMARY = "Binary files of cslatex"
DESCRIPTION = "Binary files of cslatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-cslatex-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "73f5abc8ecda673c738410f28841a35ef716c30832ea3a3f952e9c4b9f2c7ca1121f5ddc9d7aaa19bb059f376ec9dcd7b84ae54c9a5d5c856ee11b02bd9654d7"

RPROVIDES:${PN} += "texlive-cslatex-bin texlive-cslatex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cslatex"

inherit rpm
