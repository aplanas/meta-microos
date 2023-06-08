SUMMARY = "Binary files of clojure-pamphlet"
DESCRIPTION = "Binary files of clojure-pamphlet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn51944"

RPM_NAME = "texlive-clojure-pamphlet-bin-2023.20230311.svn51944-89.1.aarch64.rpm"
RPM_HASH = "e559829bb1741fbb92e1ca8b9c334d0992a0c6ccbf8c0d497615a1598d0bc60c75a47a849260a44d48caa67087c5af01bd38ba3c950c22f313895463caaf245d"

RPROVIDES:${PN} += "texlive-clojure-pamphlet-bin texlive-clojure-pamphlet-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-clojure-pamphlet"

inherit rpm
