SUMMARY = "German version of arsclassica"
DESCRIPTION = "This is a 'translation' of the arsclassica documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23803"

RPM_NAME = "texlive-translation-arsclassica-de-2023.201.svn23803-52.1.noarch.rpm"
RPM_HASH = "269b8807f6cf672c4681d165cd447eb69b14c2033c123bafdbf09c380289e3ec5b82e594cabda93de2a83151241fe49cb4f8cb2a929bb1b898a9bce1ab640aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-arsclassica-de"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
