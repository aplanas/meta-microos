SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-recommonmark-0.7.1-2.9.noarch.rpm"
RPM_HASH = "5e4bf6d891c8579164d862a670b45fb2957775572604309c95655b7347affad8306ba37f3e8a58808b834d7e445080c89d33fba74734ca9620bc4f0b1640bab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(recommonmark) python39-reCommonMark python39-recommonmark python3dist(recommonmark)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-CommonMark python39-Sphinx python39-docutils update-alternatives"

inherit rpm
