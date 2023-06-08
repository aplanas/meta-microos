SUMMARY = "Binary files of citation-style-language"
DESCRIPTION = "Binary files of citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64151"

RPM_NAME = "texlive-citation-style-language-bin-2023.20230311.svn64151-89.1.aarch64.rpm"
RPM_HASH = "fb1e901ad510a8f0ba21f5095216a56e07dc79326e5f45ab45ea0a5b6143db603c40acf185668017dbaf317941005e45eba91bcfcb47e8e8146ad061b20fa13d"

RPROVIDES:${PN} += "texlive-citation-style-language-bin texlive-citation-style-language-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-citation-style-language"

inherit rpm
