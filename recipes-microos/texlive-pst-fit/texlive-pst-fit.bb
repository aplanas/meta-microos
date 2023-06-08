SUMMARY = "Macros for curve fitting"
DESCRIPTION = "The package uses PSTricks to fit curves to: Linear Functions; \
Power Functions; exp Function; Log_{10} and Log_e functions; \
Recip; Kings Law data; Gaussian; and 4th order Polynomial"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn45109"

RPM_NAME = "texlive-pst-fit-2023.201.0.0.02svn45109-52.1.noarch.rpm"
RPM_HASH = "7863d8f728dac9ae9404f9a1924a6308353148f99b15dbaf7d134a88f9f24ad0cbd15a1f0a9d9442505b29a99d619d1cc37347f10bce7e6bb448bda3d90b5602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-fit.sty) tex(pst-fit.tex) texlive-pst-fit"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks-add.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
