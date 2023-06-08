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

RPM_NAME = "python310-jedi-0.18.2-5.1.noarch.rpm"
RPM_HASH = "697dbe05f3c762c74c9d4e8d011edffa949bf263e275df9d78d2dd55177da3d449751d0889363ff2f5b411cc0031ce9ee2ba7fb7f25dc9966697f4048b0b8e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedi python3.10dist(jedi) python310-jedi python3dist(jedi)"
RDEPENDS:${PN} += "(python310-parso >= 0.8.0 with python310-parso < 0.9) python(abi)"

inherit rpm
