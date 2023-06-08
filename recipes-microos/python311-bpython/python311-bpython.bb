SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python311-bpython-0.24-1.4.noarch.rpm"
RPM_HASH = "22e2f7bf098735a85480aa53e4720c7c85827e218c1b9516a01dbbd4312b7a836eb698188f819dd2810677b84e6718a54cb0f0458756ce7af2f87dc104012d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.bpython-interpreter.bpython-3.11.desktop) metainfo() metainfo(org.bpython-interpreter.bpython-3.11.metainfo.xml) python3.11dist(bpython) python311-bpython python3dist(bpython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-bpython-common python311-curtsies python311-greenlet python311-pygments python311-pyxdg python311-requests update-alternatives"

inherit rpm
