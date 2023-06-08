SUMMARY = "Enumitem documentation, in German"
DESCRIPTION = "This is a translation of the manual for enumitem."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24196"

RPM_NAME = "texlive-translation-enumitem-de-2023.201.svn24196-52.1.noarch.rpm"
RPM_HASH = "c1d52070a8a03f8c99349eaaa3bd1013c6cdc498537eb6bb36c13343b59c8e803335428adb8ddb841238cc861e192e4204bbdb29eb99687df6a162c5f32ef0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-enumitem-de"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
