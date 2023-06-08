SUMMARY = "Binary files of pmxchords"
DESCRIPTION = "Binary files of pmxchords"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32405"

RPM_NAME = "texlive-pmxchords-bin-2023.20230311.svn32405-89.1.aarch64.rpm"
RPM_HASH = "6777a9d8e02d9370bf4a3e2c4a89ce298b3f458b3a9cd7daa43f54f23f1d050a49e673e1699fd8a05f7283183372a72a21138bf5cc71855b69958cc91f5d40f4"

RPROVIDES:${PN} += "texlive-pmxchords-bin texlive-pmxchords-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pmxchords"

inherit rpm
