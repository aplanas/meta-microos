SUMMARY = "Documentation for python-happybase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python-happybase-doc-1.2.0-3.7.noarch.rpm"
RPM_HASH = "448faf89521b55330dd2d1ff634a6a33bd33719be892b4452b10e431b1c5392c085f36b5e03dd544a0e6040aa0c81b539d7692bdd590161e5b3707a5242401b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-happybase-doc python310-happybase-doc python311-happybase-doc python39-happybase-doc"
RDEPENDS:${PN} += ""

inherit rpm
