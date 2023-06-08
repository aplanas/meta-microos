SUMMARY = "Infrastructure-only scheme (no TeX at all)"
DESCRIPTION = "This is the TeX Live scheme for infrastructure only, with no \
TeX engines at all. It is useful for automated testing, where \
the actual programs and packages to be tested are installed \
separately afterwards, with tlmgr install."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-scheme-infraonly-2023.201.svn54191-56.1.noarch.rpm"
RPM_HASH = "25fe561e9aad899cdf26dbdc12f70011426c47832a35cd912a0b2287a37d45e620cdd21ea8125cd5246631841af73c2f052e0b1ff9ba7522b4440b995218aedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-infraonly"
RDEPENDS:${PN} += "texlive-hyphen-base texlive-kpathsea texlive-scripts texlive-texlive.infra"

inherit rpm
