SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "python310-dominate-2.8.0-1.1.noarch.rpm"
RPM_HASH = "345019b579a769a2db6a8753aaa867e35cdca0b63b4720610f0af39583135de3954fa59f513c9516b3f00b3e376559b8e63ade89e7ad3c0ccfe200dff3098445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dominate python3.10dist(dominate) python310-dominate python3dist(dominate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
