SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.7"

RPM_NAME = "python39-txt2tags-3.7-2.9.noarch.rpm"
RPM_HASH = "f0a8e80e4d1757b1be93f74900b106420ede000a09b75c8d6319e8e5a225bcee1e720bc43deb8c34341367edd59f266e84a829ddf5c88237302622222d17d05e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(txt2tags) python39-txt2tags python3dist(txt2tags) txt2tags"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools update-alternatives"

inherit rpm
