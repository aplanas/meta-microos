SUMMARY = "Documentation for texlive-pst-gantt"
DESCRIPTION = "This package includes the documentation for texlive-pst-gantt"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.22asvn35832"

RPM_NAME = "texlive-pst-gantt-doc-2023.201.0.0.22asvn35832-52.1.noarch.rpm"
RPM_HASH = "f89eb3aa54e7fc155bf2074e0c0441962a4943d07f0c7cfd3a2779205d691a601a601a80e2e2cd797dcc23a8e734180ba3ae1e6e94e6c670569eb97ca75a5cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gantt-doc"
RDEPENDS:${PN} += ""

inherit rpm
