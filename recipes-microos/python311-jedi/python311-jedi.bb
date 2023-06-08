SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Jedi is a static analysis tool for Python that can be used in \
IDEs/editors. Its focus is autocompletion and static \
analysis. \
 \
Jedi has support for two different goto functions. It's possible to \
search for related names and to list all names in a Python file and \
infer them. Jedi understands docstrings and you can use Jedi \
autocompletion in your REPL as well. \
 \
Jedi uses an API to connect with IDEs. There is a reference \
implementation as a VIM plugin which uses Jedi's autocompletion."
LICENSE = "MIT & Python-2.0"

PV = "0.18.2"

RPM_NAME = "python311-jedi-0.18.2-5.1.noarch.rpm"
RPM_HASH = "d15e4425f17dadb557cfd88aa5d760c3826b807f5acd424c711a06d67095af302f3919b216258991ffaa7eba887e8eac28e3f0eb651e7afe55bdb48a9c64cad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jedi) python311-jedi python3dist(jedi)"
RDEPENDS:${PN} += "(python311-parso >= 0.8.0 with python311-parso < 0.9) python(abi)"

inherit rpm
