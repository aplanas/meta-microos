SUMMARY = "Documentation for texlive-coollist"
DESCRIPTION = "This package includes the documentation for texlive-coollist"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.204.1.4svn63523"

RPM_NAME = "texlive-coollist-doc-2023.204.1.4svn63523-54.1.noarch.rpm"
RPM_HASH = "ab7f87f0ee2ad980d8547d45d96f071dc37b2e63afc3bd1f3077ec2c075277fdd6a5217065909499b29aa9bbce3d662f58ba19a97eb0246f577af3bb512c2b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coollist-doc"
RDEPENDS:${PN} += ""

inherit rpm
