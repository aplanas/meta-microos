SUMMARY = "Documentation for texlive-bhcexam"
DESCRIPTION = "This package includes the documentation for texlive-bhcexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn64093"

RPM_NAME = "texlive-bhcexam-doc-2023.201.1.7svn64093-53.1.noarch.rpm"
RPM_HASH = "36a3948004f4c910f96164f6c80cffe0fe831f0a58f92e536ebc3adc5511803a86acb644b93da097807f29c933c0e3482ca2a61f7acd315eeeffed6e75577fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bhcexam-doc:zh) \
texlive-bhcexam-doc"
RDEPENDS:${PN} += ""

inherit rpm
