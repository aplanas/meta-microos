SUMMARY = "A selection of layout styles"
DESCRIPTION = "The package provides several page layouts, selectable by \
package options."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn53207"

RPM_NAME = "texlive-fjodor-2023.201.svn53207-52.1.noarch.rpm"
RPM_HASH = "8f54a83b3a4e767ec7ccba324461eb6108121dce33d1cd78ed022d48e5f8f5501accf91d58098baff107d6fac1003f7ea207c3d1cf427c6d162ff5c88957ab87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fjodor.sty) \
texlive-fjodor"
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
