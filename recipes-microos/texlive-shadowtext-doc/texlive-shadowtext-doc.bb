SUMMARY = "Documentation for texlive-shadowtext"
DESCRIPTION = "This package includes the documentation for texlive-shadowtext"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn26522"

RPM_NAME = "texlive-shadowtext-doc-2023.201.0.0.3svn26522-53.1.noarch.rpm"
RPM_HASH = "bdf719f65488d1747b425853b549c05f809c95d93a07a4d48c10cc89ddba7174feb6943338da9e93b16d51380a0a124741c0a4bac22e3b39c3918e248bf11be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadowtext-doc"
RDEPENDS:${PN} += ""

inherit rpm
