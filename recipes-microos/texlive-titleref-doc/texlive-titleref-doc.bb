SUMMARY = "Documentation for texlive-titleref"
DESCRIPTION = "This package includes the documentation for texlive-titleref"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.1svn18729"

RPM_NAME = "texlive-titleref-doc-2023.201.3.1svn18729-52.1.noarch.rpm"
RPM_HASH = "15ca38e6168dd4be7c57034ef857538b5000826e164216113b75adb42e60a5a48be5c28d7f8fba3c13b2be6c6eecf88f2d4e1c5b228fcf8662e8e8d1f86c1cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titleref-doc"
RDEPENDS:${PN} += ""

inherit rpm
