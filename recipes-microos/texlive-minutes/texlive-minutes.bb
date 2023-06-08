SUMMARY = "Typeset the minutes of meetings"
DESCRIPTION = "Supports the creation of a collection of minutes. Features \
include: Support of tasks (who, schedule, what, time of \
finishing; possibility of creating a list of open tasks; \
inclusion of open tasks from other minutes; Support for \
attachments; Support of schedule dates (in planning: support \
for the calendar package); Different versions ('secret parts'); \
and Macros for votes and decisions (list of decisions). Support \
for minutes in German, Dutch and English is provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8fsvn42186"

RPM_NAME = "texlive-minutes-2023.201.1.8fsvn42186-54.1.noarch.rpm"
RPM_HASH = "e5df4245f83def1c1fa788d8fa163d6dc57fbf919c613ee77b38210973f16db556c4f25d2f91dfdea35ae6b436c6317ed8bcd66a1503322314a194ec168e96f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minutes.sty) texlive-minutes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) tex(minitoc.sty) tex(multicol.sty) tex(url.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
