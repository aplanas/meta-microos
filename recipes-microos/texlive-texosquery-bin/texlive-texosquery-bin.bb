SUMMARY = "Binary files of texosquery"
DESCRIPTION = "Binary files of texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43596"

RPM_NAME = "texlive-texosquery-bin-2023.20230311.svn43596-91.1.aarch64.rpm"
RPM_HASH = "4e2873b893e20a2d37bad278035e482111bc45c198e4db5ce02e47f6aefdfb4c64b3f5da8757d551c8e3ff11a5923fea9f1980e5856ce3e9c9f1aa5778d52901"

RPROVIDES:${PN} += "texlive-texosquery-bin texlive-texosquery-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texosquery"

inherit rpm
