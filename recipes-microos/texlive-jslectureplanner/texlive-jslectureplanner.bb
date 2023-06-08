SUMMARY = "Creation and management of university course material"
DESCRIPTION = "The jslectureplanner package facilitates the generation and \
management of university course material. It provides an \
interface to set up and access centralized course data that can \
be reused in all course documents. Furthermore, the package is \
able to calculate the session dates of a whole semester and \
generate course programs, if the course is held weekly and the \
date of the first lecture is specified. Moreover, the package \
can be used to generate a sectioned course bibliography via \
BibLaTeX. The bundle also includes a package jsmembertable.sty \
that helps in generating course member and presence lists."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn57095"

RPM_NAME = "texlive-jslectureplanner-2023.201.1.12svn57095-55.1.noarch.rpm"
RPM_HASH = "17eb53f83712966231032b4097879246eac1c2c687cd4314edcc140bbcc080f8bdf510eba7fbb9eda44fa3d40b2504b1916e8965c5b5fec14cb1537361da7611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jslectureplanner.sty) tex(jsmembertable.sty) texlive-jslectureplanner"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(calc.sty) tex(datatool.sty) tex(datetime2.sty) tex(etoolbox.sty) tex(hhline.sty) tex(ifthen.sty) tex(longtable.sty) tex(xkeyval.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
