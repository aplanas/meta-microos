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

RPM_NAME = "python39-jedi-0.18.2-5.1.noarch.rpm"
RPM_HASH = "537ea07991559d7500240e9bf9a088d33fd7394e0609e6caab83ada91aa2445130bd1b80befa8b56af20423f9799abd7d8f99c6d13bfaad23ce942bcf64b6dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jedi) python39-jedi python3dist(jedi)"
RDEPENDS:${PN} += "(python39-parso >= 0.8.0 with python39-parso < 0.9) python(abi)"

inherit rpm
