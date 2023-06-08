SUMMARY = "Documentation for texlive-jupynotex"
DESCRIPTION = "This package includes the documentation for texlive-jupynotex"
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.1svn56715"

RPM_NAME = "texlive-jupynotex-doc-2023.201.0.0.1svn56715-55.1.noarch.rpm"
RPM_HASH = "2f5c6fa08c19280f5a5acf03b79be799a122d015d9617235f3771fbf81d3cddeb719a9f7f8f1c55608b0d79ec08d0f2153b505aecac25ffd6144bd6d9df0cac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jupynotex-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
