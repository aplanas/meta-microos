SUMMARY = "Documentation for texlive-context-french"
DESCRIPTION = "This package includes the documentation for texlive-context-french"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn54215"

RPM_NAME = "texlive-context-french-doc-2023.204.svn54215-54.1.noarch.rpm"
RPM_HASH = "2cb502c0d47ead6dc827441c01bed1e0af6e3fe7bef2dc4aa67b403a57d920bb4a94951c48b0d8b4256d9305f319d32abf6acccedf95759206a8269ed57a68d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-french-doc"
RDEPENDS:${PN} += ""

inherit rpm
