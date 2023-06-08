SUMMARY = "Generalization of LaTeX's minipages"
DESCRIPTION = "The GenMPage package generalizes LaTeX's minipages. Keyval \
options and styles can be used to determine their appearance in \
an easy and consistent way. Includes options for paragraph \
indentation and vertical alignment with respect to the visual \
top and bottom margins."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1svn15878"

RPM_NAME = "texlive-genmpage-2023.201.0.0.3.1svn15878-52.1.noarch.rpm"
RPM_HASH = "ef4d27965b0a5cc26d79e89f4e5dedfe9c9405f92b730b70fb580769fd9f35211b5fe53c0227d2d8da55121a58d309bfafa3ec0ba68034e4257b72c1585292a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(genmpage.sty) texlive-genmpage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
