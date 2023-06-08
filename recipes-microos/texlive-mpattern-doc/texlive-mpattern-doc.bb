SUMMARY = "Documentation for texlive-mpattern"
DESCRIPTION = "This package includes the documentation for texlive-mpattern"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mpattern-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "1855d36dd9583350e08fdb8aa8efaefd6e59035d917dd025937e5f103b3803a7413b927689287ce248374aef0a59511d635d10e2664c21833cf881bc347bc7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-mpattern-doc:en;pl) texlive-mpattern-doc"
RDEPENDS:${PN} += ""

inherit rpm
