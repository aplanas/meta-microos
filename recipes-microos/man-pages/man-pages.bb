SUMMARY = "Linux  Manual Pages"
DESCRIPTION = "A large collection of man pages (documentation) from the Linux \
Documentation Project (LDP).  The man pages are organized into the \
following sections: Section 1, user commands (intro only); Section 2, \
system calls; Section 3, libc calls; Section 4, devices (e.g., hd, sd); \
Section 5, file formats and protocols (e.g., wtmp, /etc/passwd, nfs); \
Section 6, games (intro only); Section 7, conventions, macro packages, \
etc. (e.g., nroff, ascii); and Section 8, system administration (intro \
only)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "6.02"

RPM_NAME = "man-pages-6.02-1.2.noarch.rpm"
RPM_HASH = "c981fd896e14062105203981740f36213be73fe3247a61a1267cbab1cf8871e8d46d3993f67f2d0d46d88b05c7073806769127bf85e69d9c80624ea1142b0ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pages"
RDEPENDS:${PN} += ""

inherit rpm
