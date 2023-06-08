SUMMARY = "A practical guide to LaTeX and Polyglossia for Marathi and other Indian languages"
DESCRIPTION = "The package provides a short guide to LaTeX and specifically to \
the polyglossia package. This document aims to introduce LaTeX \
and polyglossia for Indian languages. Though the document often \
discusses the language Marathi, the discussion applies to other \
India languages also, with some minute changes which are \
described in Section 1.2. We assume that the user of this \
document knows basic (La)TeX or has, at least, tried her hand \
on it. This document is not very suitable for first time users."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55475"

RPM_NAME = "texlive-latex-mr-2023.201.1.0svn55475-55.1.noarch.rpm"
RPM_HASH = "dc0d6d7efc54910d80e6851cd426740ec8a1808de8d8ef827b414e48b26775a7e140805123dc2e4dd3ad624d4f3c93073a90ce607152a55680e737654f4312e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-mr"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
