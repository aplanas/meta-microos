SUMMARY = "Format linguists' examples"
DESCRIPTION = "This bundle comprises two packages: The linguex package \
facilitates the formatting of linguist examples, automatically \
taking care of example numbering, indentations, indexed \
brackets, and the '*' in grammaticality judgments. The ps-trees \
package provides linguistic trees, building on the macros of \
tree-dvips, but overcoming some of the older package's \
shortcomings."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.3svn30815"

RPM_NAME = "texlive-linguex-2023.201.4.3svn30815-54.1.noarch.rpm"
RPM_HASH = "9fbdb7b312132adafeb3c1a757c1839b1bd6bbdfa2d68b20150779c54d763bfe9579e619724a6d3e37b99dd9805bbecdd0ad5fbffd80597cc8a85f59f72f9b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(linguex.sty) tex(linguho.sty) tex(ps-trees.sty) texlive-linguex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cgloss4e.sty) tex(tree-dvips.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
