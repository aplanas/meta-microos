SUMMARY = "Semantic commands for adding formatted index entries"
DESCRIPTION = "The package provides commands for adding formatted index \
entries; it arises from the author's work on large documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-2023.201.0.0.2csvn54554-52.1.noarch.rpm"
RPM_HASH = "08999c6058cf203cee945c7a4dbe4032f0132fd48f4583cf8346d33909755d47ab67ec91267c31e875cc5f172adfe4575266ac5fd77838d1cfa73df0b6a0bcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(idxcmds.sty) \
texlive-idxcmds"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(ltxcmds.sty) \
tex(pgfopts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
