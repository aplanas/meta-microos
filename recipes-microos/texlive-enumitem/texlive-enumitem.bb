SUMMARY = "Control layout of itemize, enumerate, description"
DESCRIPTION = "This package provides user control over the layout of the three \
basic list environments: enumerate, itemize and description. It \
supersedes both enumerate and mdwlist (providing \
well-structured replacements for all their funtionality), and \
in addition provides functions to compute the layout of labels, \
and to 'clone' the standard environments, to create new \
environments with counters of their own."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9svn51423"

RPM_NAME = "texlive-enumitem-2023.201.3.9svn51423-53.1.noarch.rpm"
RPM_HASH = "ca007af82e936ad83bad381ec58ec3919fd251b82e2256b24d5c29cbc1316b70a567fe9c897794775e5a9c28093f250a8befa805cd1e6213c992e5cb2e1caf2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(enumitem.sty) texlive-enumitem"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
