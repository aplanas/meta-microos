SUMMARY = "Hyperlinks for a wide range of URIs"
DESCRIPTION = "The package provides automatic hyperlinks for URIs of type \
arXiv, ASIN, DOI, HDL, NBN, OCLC, OID, PubMed, TINY, TINY with \
preview, and WebCite and provides commands \\citeurl, \\mailto, \
\\ukoeln, and \\uref."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn48602"

RPM_NAME = "texlive-uri-2023.201.2.0bsvn48602-53.1.noarch.rpm"
RPM_HASH = "ce527bf69e656814a44e2a1c092551ed06fcffa29705f302053a2a534a7dabeb5433a317d0a5f9052fdef7a966e92fcef931e258c7866932189dd3c63bb8a17d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uri.sty) \
texlive-uri"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
