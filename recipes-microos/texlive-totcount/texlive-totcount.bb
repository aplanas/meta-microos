SUMMARY = "Find the last value of a counter"
DESCRIPTION = "The package records the value that was last set, for any \
counter of interest; since most such counters are simply \
incremented when they are changed, the recorded value will \
usually be the maximum value."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21178"

RPM_NAME = "texlive-totcount-2023.201.1.2svn21178-52.1.noarch.rpm"
RPM_HASH = "4a290b31eb6509cfc432fd985cc4a3094fe373fd8d8ae16ec3502f8ffb3653d0b27964ab2789ef8efae577b32fa2b48dbf73289651b013fb3456f8ae8e0e6602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(totcount.sty) texlive-totcount"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
