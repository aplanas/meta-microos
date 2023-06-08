SUMMARY = "Binary files of tex4ebook"
DESCRIPTION = "Binary files of tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37771"

RPM_NAME = "texlive-tex4ebook-bin-2023.20230311.svn37771-89.1.aarch64.rpm"
RPM_HASH = "a50e4a15590cdbe25d2f32cc39436a8e94334bd721a2394ec040ebdeb7f08d180d46f703e22862fdd69626d64f1961cd03ca75b1abdd81b6db1cc8e798d1ec2c"

RPROVIDES:${PN} += "texlive-tex4ebook-bin texlive-tex4ebook-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-tex4ebook"

inherit rpm
