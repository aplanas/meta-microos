SUMMARY = "Meaningful semantic markup in the spirit of the Text Encoding Initiative"
DESCRIPTION = "The package provides simple commands to allow authors \
(especially scholars in the humanities) to write with a focus \
on content rather than presentation. The commands are inspired \
by the XML elements of the Text Encoding Initiative. Commands \
like \\term and \\foreign are aliases for \\emph. \\quoted and \
\\soCalled are aliases for quoting commands. These commands \
could be easily redefined for different formats. The package \
also provides a footnote environment so that long footnotes can \
be more cleanly separated from the main text. Because the \
author is a music scholar, the package also includes some \
macros for musical symbols and other basic notations for \
musical analysis."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53607"

RPM_NAME = "texlive-semantic-markup-2023.201.svn53607-53.1.noarch.rpm"
RPM_HASH = "56f333545ae6343588e52d0456a18807c0533502426db4cc6016569f8ca2148925d8c9d58106a7ca22dc9c944cd0569b5347a7956b1eaf16d59ff7b9d0952ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(semantic-markup.sty) texlive-semantic-markup"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(csquotes.sty) tex(endnotes.sty) tex(environ.sty) tex(stackengine.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
