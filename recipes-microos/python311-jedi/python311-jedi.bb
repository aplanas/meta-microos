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

RPM_NAME = "python311-jedi-0.18.2-6.1.noarch.rpm"
RPM_HASH = "74156a8ac0cea00b014d918f9a5d472c35a1278a22e8b7535fb4d9428b8b46bc63a3e027f336c7356105e082b0f2f304cceddb2f4bd4e44d5c6d054d6b79c1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jedi) python311-jedi python3dist(jedi)"
RDEPENDS:${PN} += "(python311-parso >= 0.8.0 with python311-parso < 0.9) python(abi)"

inherit rpm
