SUMMARY = "Typesetting stageplay scripts"
DESCRIPTION = "Plari (the name comes from the Finnish usage for the working \
copy of a play) is a report-alike class, without section \
headings, and with paragraphs vertically separated rather than \
indented."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-plari-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "350fbd12003846470243fa0deca681eb0e283f0c8a82db4c5c6d25a3f1e368b4f0a93f34ee784d01bee2b6b5cf9a15d751338cee87a911c5ef562befa3f61553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plari.cls) texlive-plari"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(report.cls) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
