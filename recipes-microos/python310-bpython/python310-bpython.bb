SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python310-bpython-0.24-1.4.noarch.rpm"
RPM_HASH = "447d8d3e611e6901eefa8dfa10f7efa204c335e0ceb322f3c6f5a8783c1896492f1361e5ce15a2330bd48ec4525edbbc38b2f4bb9c2ff3e29f81801c87a7b11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.bpython-interpreter.bpython-3.10.desktop) metainfo() metainfo(org.bpython-interpreter.bpython-3.10.metainfo.xml) python3-bpython python3.10dist(bpython) python310-bpython python3dist(bpython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-bpython-common python310-curtsies python310-greenlet python310-pygments python310-pyxdg python310-requests update-alternatives"

inherit rpm
