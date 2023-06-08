SUMMARY = "ConTeXt scheme"
DESCRIPTION = "This is the TeX Live scheme for installing ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59636"

RPM_NAME = "texlive-scheme-context-2023.201.svn59636-56.1.noarch.rpm"
RPM_HASH = "5632ee5a974917fce053015178398a20e4ad91814f1eff5333f1602698c27bfee47b811c61f4d638cec922b9b186d0cb5db9417b337669aa2a29ecd675a63c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(context) texlive-scheme-context"
RDEPENDS:${PN} += "texlive-antt texlive-asana-math texlive-ccicons texlive-collection-context texlive-collection-metapost texlive-dejavu texlive-eulervm texlive-gentium-tug texlive-iwona texlive-kurier texlive-ly1 texlive-manfnt-font texlive-marvosym texlive-mflogo-font texlive-poltawski texlive-pxfonts texlive-tex-gyre texlive-tex-gyre-math texlive-txfonts texlive-wasy texlive-xits"

inherit rpm
