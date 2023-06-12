SUMMARY = "Create beautiful semester timetables and more"
DESCRIPTION = "This package defines several useful environments for a \
beautiful printable semester plan. It includes a timetable \
(which is using the schedule-Package) as well as appointments, \
deadlines, and exams. The package requires color, TikZ, \
schedule, and fontawesome. Furthermore, documents need to be \
compiled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56841"

RPM_NAME = "texlive-semesterplanner-2023.201.1.0svn56841-53.1.noarch.rpm"
RPM_HASH = "0c272d34503a03c68b029327d29bc368c5a067b5c70f3821582a21d721236c3293a1eb4a7c4869f7b4a8063a026bc81ad9cc397c22e959560755071779098342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(semesterplanner.sty) \
texlive-semesterplanner"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(fontawesome.sty) \
tex(schedule.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
