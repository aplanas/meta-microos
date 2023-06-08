SUMMARY = "Documentation for texlive-treetex"
DESCRIPTION = "This package includes the documentation for texlive-treetex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28176"

RPM_NAME = "texlive-treetex-doc-2023.201.svn28176-52.1.noarch.rpm"
RPM_HASH = "20f6839c90ae192e03e409a37849e27bec9618c889c2bea494f090967917d45059c17410bc0c8e0fbf7913a4210756d19d0f58478fbc3ebab5059c88e61f0c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-treetex-doc"
RDEPENDS:${PN} += ""

inherit rpm
