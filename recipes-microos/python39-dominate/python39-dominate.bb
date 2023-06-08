SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python39-dominate-2.7.0-2.3.noarch.rpm"
RPM_HASH = "4bf685dac6971ff5c59d185a35befaddffac0312b59a86bcf7934d8935ec498138c3dbd8b6896ab13f6e4d90829dab3b4f29b1816f20dc8cf01f788cd148a6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dominate) python39-dominate python3dist(dominate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
