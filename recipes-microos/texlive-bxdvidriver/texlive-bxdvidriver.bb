SUMMARY = "Enables specifying a driver option effective only in DVI output"
DESCRIPTION = "This single-function package enables authors to specify a \
global driver option (dvips, dvipdfmx, etc) which is applied \
only when the engine outputs a DVI file. It is useful to create \
special document- templates that can be compiled in both \
PDF-mode and DVI-mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn43219"

RPM_NAME = "texlive-bxdvidriver-2023.201.0.0.2asvn43219-52.1.noarch.rpm"
RPM_HASH = "d9d7755be6d071ec2097ae116df5f7412ac6062df55353db854c5e1f6b4e4b7a07ea6e4d6e2841156d3d12c0501de4a376734b23929d3dcf9bbddf4a4d6d12c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxdvidriver.sty) texlive-bxdvidriver"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifluatex.sty) tex(ifpdf.sty) tex(ifvtex.sty) tex(ifxetex.sty) tex(pdftexcmds.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
