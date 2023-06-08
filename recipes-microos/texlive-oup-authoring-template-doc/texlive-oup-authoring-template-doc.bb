SUMMARY = "Documentation for texlive-oup-authoring-template"
DESCRIPTION = "This package includes the documentation for texlive-oup-authoring-template"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64491"

RPM_NAME = "texlive-oup-authoring-template-doc-2023.201.1.1svn64491-54.1.noarch.rpm"
RPM_HASH = "a5b4405b7a0dedcd07f41463bd65a76d187fd9a885bc6146ac2233d1960687cd3c99d163b32331a7dae825c09a833b0e8063e7efb14d5ecee1b26154a3cf9e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oup-authoring-template-doc"
RDEPENDS:${PN} += ""

inherit rpm
