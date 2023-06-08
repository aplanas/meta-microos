SUMMARY = "Randomise token strings"
DESCRIPTION = "The package provides means of randomising lists of tokens, or \
lists of chunks of tokens. Two mechanisms for defining chunks \
are provided: the \\ranToks command accepts an argument \
containing tokens to be randomised; and the \\bRTVToks/\\eRTVToks \
commands delimit a collection of tokens for randomising; each \
group inside a rtVw constitutes one of these (typically larger) \
token sets."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59515"

RPM_NAME = "texlive-ran_toks-2023.201.svn59515-53.1.noarch.rpm"
RPM_HASH = "f8359a91da3a30e5537588bb183d474c4bfb577b8aa85cd5c5e467ce1907e46b00033729c4e0e9db86bb8973001ef8950d765e3b452c034475709a3208024383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ran-toks.sty) tex(ran_toks.sty) tex(rt-dbapp.def) texlive-ran_toks"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(verbatim.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
