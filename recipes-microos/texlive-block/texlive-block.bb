SUMMARY = "A block letter style for the letter class"
DESCRIPTION = "A style file for use with the letter class that overwrites the \
\\opening and \\closing macros so that letters can be styled with \
the block letter style instead of the default style. Thus, the \
return address, the closing, and the signature appear flushed \
on the left margin."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17209"

RPM_NAME = "texlive-block-2023.201.svn17209-52.1.noarch.rpm"
RPM_HASH = "748b2a85d68b0f665234a2c77a567a7c456a70c7100dbbee440671b2609d2de1e04a47e0477f9897d7d4eab77601ceaaf6323dc589a597dca47dde8fb3dbddb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(block.sty) \
texlive-block"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
