SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-flake8-pyi-23.1.2-1.2.noarch.rpm"
RPM_HASH = "6b42349a21de4b5de419832eaf01fedf68a0cfca6bf1a0a72e8bd23f430507b0c825931d148c92e647dc3a9bcc757a116b748fe901f1515e4c434dd0ab9261ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-pyi) python311-flake8-pyi python3dist(flake8-pyi)"
RDEPENDS:${PN} += "python(abi) python311-attrs python311-base python311-flake8 python311-pyflakes python311-typing"

inherit rpm
