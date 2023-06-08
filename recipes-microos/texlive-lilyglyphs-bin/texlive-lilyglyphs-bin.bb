SUMMARY = "Binary files of lilyglyphs"
DESCRIPTION = "Binary files of lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31696"

RPM_NAME = "texlive-lilyglyphs-bin-2023.20230311.svn31696-89.1.aarch64.rpm"
RPM_HASH = "9a3abbb55b039531954806e5dec10f1d436ff17eda680f1a03f117fc61de4aca59dcf5bca34ff9fac0fee837adb598fa001411e78fa049c97b8ffff7ae16672f"

RPROVIDES:${PN} += "texlive-lilyglyphs-bin texlive-lilyglyphs-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-lilyglyphs"

inherit rpm
