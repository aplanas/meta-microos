SUMMARY = "Execute foreign source code and embed the result in the pdf file"
DESCRIPTION = "This LaTeX package executes programming source codes (including \
all command line tools) from within LaTeX and embeds the output \
in the resulting .pdf file. Many programming languages can be \
easily used and any command-line executable can be invoked when \
preparing the .pdf file from a .tex file. It is however \
recommended to use this package in server-mode together with \
the Python talk2stat package. Currently, this server-mode \
supports Julia, MatLab, Python, and R. More languages will be \
added. For more details and usage examples, refer to the \
package's github repository."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn65588"

RPM_NAME = "texlive-runcode-2023.201.1.8svn65588-53.1.noarch.rpm"
RPM_HASH = "df05e9e381f13168f8b5703093752eeaffff29acb80ab6ef6962110d6ba1e938fdd050a7a64b071386d7ecb640097a19541ccec9869655eea54cca97a815a1b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(runcode.sty) \
texlive-runcode"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(filecontents.sty) \
tex(fvextra.sty) \
tex(inputenc.sty) \
tex(listings.sty) \
tex(minted.sty) \
tex(morewrites.sty) \
tex(tcolorbox.sty) \
tex(textgreek.sty) \
tex(xcolor.sty) \
tex(xifthen.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
