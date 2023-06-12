SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.3.1"

RPM_NAME = "python311-pytest-7.3.1-1.1.noarch.rpm"
RPM_HASH = "c0a03182c3febfc6d123d68f117428d624b28d8303c658bb38a5bfd850a074b28ddb18f29b9fa6f98a0bcb75a5aa86bb8e62f487c21f60a78ccdaa47ac47cda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest) \
python311-pytest \
python3dist(pytest)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-attrs \
python311-exceptiongroup \
python311-importlib-metadata \
python311-iniconfig \
python311-packaging \
python311-pluggy \
python311-setuptools \
python311-tomli"

inherit rpm
