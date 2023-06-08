SUMMARY = "Provide file name and path of input files"
DESCRIPTION = "The package provides macros holding file name information \
(directory, base name, extension, full name and full path) for \
files read by LaTeX \\input and \\include macros; it uses the \
file hooks provided by the author's filehook. In particular, it \
restores the parent file name after the trailing \\clearpage of \
an \\included file; as a result, the macros may be usefully \
employed in the page header and footer of the last printed page \
of such a file. The depth of inclusion is made available, \
together with the 'parent' (including file) and 'parents' (all \
including files to the root of the tree). The package \
supersedes FiNK."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.8svn64673"

RPM_NAME = "texlive-currfile-2023.204.0.0.8svn64673-54.1.noarch.rpm"
RPM_HASH = "9c8c501d2ed6243b45be66e7e09f46cecb3c48db81b1c352a6a6db1410b95fc1b6e177c38ee07f436fa6816207af702f00f46f12df724defd84ae679eed7773f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(currfile-abspath.sty) tex(currfile.sty) texlive-currfile"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(filehook.sty) tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
