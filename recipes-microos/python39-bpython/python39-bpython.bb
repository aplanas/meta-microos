SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python39-bpython-0.24-1.4.noarch.rpm"
RPM_HASH = "4ca13d85e9d081d0df2ce85b9febcbb8a524d8c0c1de7e22ff5a50b58e8245aef9b9835e4dd8d97a479dfa38509ca153a84ed7edfc2a48487b73aa6fb6391a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.bpython-interpreter.bpython-3.9.desktop) metainfo() metainfo(org.bpython-interpreter.bpython-3.9.metainfo.xml) python3.9dist(bpython) python39-bpython python3dist(bpython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-bpython-common python39-curtsies python39-greenlet python39-pygments python39-pyxdg python39-requests update-alternatives"

inherit rpm
