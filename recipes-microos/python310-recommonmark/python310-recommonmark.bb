SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-recommonmark-0.7.1-2.9.noarch.rpm"
RPM_HASH = "3ea85b652c37ddddd0d87612acc5dadc6af5e792b33c842f11bb749a2821d2fb3c9accd4147aff4749a772dc1c670c7375d5a83faec9014714230e28ce0fd66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reCommonMark python3-recommonmark python3.10dist(recommonmark) python310-reCommonMark python310-recommonmark python3dist(recommonmark)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-CommonMark python310-Sphinx python310-docutils update-alternatives"

inherit rpm
