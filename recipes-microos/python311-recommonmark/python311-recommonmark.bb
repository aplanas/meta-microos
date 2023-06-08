SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-recommonmark-0.7.1-2.9.noarch.rpm"
RPM_HASH = "6d74f76ac9bec90de2bc072ec6f32cd3cbc09980437d5ff671a3fcb65ebd90f7b48e250b4dde3b3e13e48994a41ea9b65045e5adea418a32f1cf2b12cd79b5a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(recommonmark) python311-reCommonMark python311-recommonmark python3dist(recommonmark)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-CommonMark python311-Sphinx python311-docutils update-alternatives"

inherit rpm
