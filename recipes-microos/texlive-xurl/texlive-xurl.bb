SUMMARY = "Allow URL breaks at any alphanumerical character"
DESCRIPTION = "This package loads url by default and defines possible URL \
breaks for all alphanumerical characters, as well as = / . : * \
- ~ ' ' All arguments which are valid for url can be used and \
will be passed on to this package. For more information read \
the documentation of url itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10svn61553"

RPM_NAME = "texlive-xurl-2023.201.0.0.10svn61553-52.1.noarch.rpm"
RPM_HASH = "cea110d5f2558992340247826826bfa76ff03f6896945a69d19dc8215f7b20cf32573c4562fa5160d6ab587c323f0d228efa26b7746978cea95dac4694b9517e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xurl.sty) texlive-xurl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
