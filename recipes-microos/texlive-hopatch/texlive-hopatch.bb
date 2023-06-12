SUMMARY = "Load patches for packages"
DESCRIPTION = "Hopatch provides a command with which the user may register of \
patch code for a particular package. Hopatch will apply the \
patch immediately, if the relevant package has already been \
loaded; otherwise it will store the patch until the package \
appears."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn65491"

RPM_NAME = "texlive-hopatch-2023.201.1.5svn65491-53.1.noarch.rpm"
RPM_HASH = "fbc989550c24a2f4aa77e9916c518bb732ee3e00390f299c7d2fb8dfef63d9bc4a9c23273e4ca9f5642365ed5f143f2b1c7f03b313a5ed639c2e5df0e5835707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hopatch-2016-05-16.sty) \
tex(hopatch.sty) \
texlive-hopatch"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
