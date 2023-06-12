SUMMARY = "Binary files of lilyglyphs"
DESCRIPTION = "Binary files of lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31696"

RPM_NAME = "texlive-lilyglyphs-bin-2023.20230311.svn31696-91.1.aarch64.rpm"
RPM_HASH = "a6be50aae53e3eb3ee9e7925c9b9ca9a9e419a10d1dc58ecf480b99dd2e73cb7f80becabc451e023f69fc8fd3f17f40ad1a268735d6712032da446f369cd82a1"

RPROVIDES:${PN} += "texlive-lilyglyphs-bin texlive-lilyglyphs-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-lilyglyphs"

inherit rpm
