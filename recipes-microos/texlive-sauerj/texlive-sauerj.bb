SUMMARY = "A bundle of utilities by Jonathan Sauer"
DESCRIPTION = "The bundle consists of: a tool for collecting text for later \
re-use, a tool for typesetting the 'meta-information' within a \
text, a tool for use in constructing macros with multiple \
optional parameters, a package for multiple column parallel \
texts, a tool for processing key-value structured lists, and \
macros for typesetting a number as a German-language string."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-sauerj-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "734a3c316e54d6cda9d128310a6be66b256e3a851ac0140d72ef4bd1317e5b9bc17646b1df234a63fc573a85493a923f49f9e6ce851205d677b9e7901a779e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(collect.sty) \
tex(metainfo.sty) \
tex(optparams.sty) \
tex(parcolumns.sty) \
tex(processkv.sty) \
tex(zahl2string.sty) \
texlive-sauerj"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
