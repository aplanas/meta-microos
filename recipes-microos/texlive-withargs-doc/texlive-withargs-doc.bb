SUMMARY = "Documentation for texlive-withargs"
DESCRIPTION = "This package includes the documentation for texlive-withargs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1svn52641"

RPM_NAME = "texlive-withargs-doc-2023.201.0.0.3.1svn52641-53.1.noarch.rpm"
RPM_HASH = "fc4e42ca31006baa5c9a58e3f3bea2dcb55bef8c4fc85ff5cc40e15c7ad514f2a9d9b61d4ee40cde11978e3d5d03e197737ddde9cf495e7a016120e94fbd4bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-withargs-doc"
RDEPENDS:${PN} += ""

inherit rpm
