SUMMARY = "Hooks for standard TeX token lists"
DESCRIPTION = "The package takes control of the six TeX token registers \
\\everypar, \\everymath, \\everydisplay, \\everyhbox, \\everyvbox \
and \\everycr. Real hooks for each of the registers may be \
installed using a stack like interface. For backwards \
compatibility, each of the \\everyX token lists can be set \
without interfering with the hooks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn35675"

RPM_NAME = "texlive-everyhook-2023.201.1.2svn35675-52.1.noarch.rpm"
RPM_HASH = "ccc8d84bf6d8d248f891d026dba3c4f9fbb8248ea0caf1c52c4448d0fff994693133edc5e92680056d8df098aeae6f31463a77cdbdc3ef5d0077fb17e3f0870e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(everyhook.sty) \
texlive-everyhook"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(svn-prov.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
