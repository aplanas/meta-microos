SUMMARY = "Tune the output format of dates according to language"
DESCRIPTION = "This package provides ten output formats of the commands \
\\today, \\printdate, \\printdateTeX, and \\daterange (partly \
language dependent). Formats available are: ISO (yyyy-mm-dd), \
numeric (e.g. dd.\\,mm.~yyyy), short (e.g. dd.\\,mm.\\,yy), TeX \
(yyyy/mm/dd), original (e.g. dd. mmm yyyy), short original \
(e.g. dd. mmm yy), as well as numerical formats with Roman \
numerals for the month. The commands \\printdate and \
\\printdateTeX print any date. The command \\daterange prints a \
date range and leaves out unnecessary year or month entries. \
This package supports German (old and new rules), Austrian, US \
English, British English, French, Danish, Swedish, and \
Norwegian."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.28svn16613"

RPM_NAME = "texlive-isodate-2023.201.2.28svn16613-55.1.noarch.rpm"
RPM_HASH = "84444a191cc0069781fbd08e28ae94ec86fe174cf04a127c1d5a056313b21a89dbb94a2b51ea754f48387a9efc29d24a10af0c75cbc327477783614796a157b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(isodate.sty) tex(isodateo.sty) texlive-isodate"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(ifthen.sty) tex(substr.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
